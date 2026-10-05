package mx.com.inscitech.fiducia.common.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;

import java.math.BigDecimal;

import java.util.Date;

import mx.com.inscitech.fiducia.common.services.LoggingService;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXDataReader implements ExcelDataReader {
    private static final Logger LOGGER = LoggerFactory.getLogger(XLSXDataReader.class);

    
    private static final String NO_EXISTE_NO_LEER = "El archivo especificado no existe o no puede ser leido! Archivo: [%s], Existe: [%s], Puede ser leido: [%s]";
    private static final String FORMATO_NO_VALIDO = "El archivo especificado no corresponde al formato XLSX! Archivo: [%s], Existe: [%s], Puede ser leido: [%s]";
    
    private LoggingService logger = null;
    
    private enum READER_STATE {
        JUST_WORKBOOK,
        WORKBOOK_AND_SHEET,
        WORKBOOK_SHEET_AND_ROW,
        WORKBOOK_SHEET_ROW_AND_CELL,
    }
    
    private String filePath = "";
    private String fileName = "";
    
    private Workbook theWorkBook = null;
    private Sheet currentSheet = null;
    private Row currentRow =  null;
    private Cell currentCell =  null;
    
    private int sheetCount = -1;
    private int columnCount = -1;
    private int rowCount = -1;
    
    public XLSXDataReader() {
        super();
        logger = LoggingService.getNewInstance();
    }
    
    public void openWorkBook(String filePath) throws ExcelReadingException {
        File theFile = new File(filePath);
        openWorkBook(theFile);
    }
    
    public void openWorkBook(File theFile) throws ExcelReadingException {        
        
        boolean exists = false, readable = false;

        this.filePath = theFile.getAbsolutePath();
        fileName = theFile.getName();
        
        try {
            
            exists = theFile.exists();
            readable = theFile.canRead();
            
            if(exists && readable) {
                theWorkBook = new XSSFWorkbook(theFile);
            } else {
                throw new ExcelReadingException(String.format(NO_EXISTE_NO_LEER, filePath, exists, readable));
            }

        } catch(InvalidFormatException ife) {
            String msg = String.format(FORMATO_NO_VALIDO, filePath, exists, readable);
            //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.ERROR, msg);
            throw new ExcelReadingException(msg, ife);
        } catch (IOException ioe) {
            String msg = String.format(NO_EXISTE_NO_LEER, filePath, exists, readable);
            //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.ERROR, msg);
            throw new ExcelReadingException(msg, ioe);
        }
        
    }

    public void closeWorkBook() {
        if(theWorkBook == null) {
            String msg = "Operacion: Cerrar Archivo. Mensaje: No se ha asignado un archivo o el archivo asociado ya ha sido cerrado!";
            //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.WARN, msg);
        } else {
            try {
                theWorkBook.close();                
            } catch (IOException e) {
                LOGGER.debug("Error "+e);
                //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.WARN, "Error al cerrar el archivo.", e);
            }
        }
        
        resetComonent();
    }

    private void resetComonent() {
        theWorkBook = null;        
        currentSheet = null;        
        sheetCount = -1;
        columnCount = -1;
        rowCount = -1;
    }

    private void validateState(READER_STATE theState) {
        switch (theState) {
            case JUST_WORKBOOK:
                if(theWorkBook == null) new ExcelReadingException("No se ha asignado el documento!");
                break;
            case WORKBOOK_AND_SHEET:
                if(theWorkBook == null) new ExcelReadingException("No se ha asignado el documento!");
                if(currentSheet == null) new ExcelReadingException("No se ha asignado la hoja a trabajar!");
                break;
            case WORKBOOK_SHEET_AND_ROW:
                if(theWorkBook == null) new ExcelReadingException("No se ha asignado el documento!");
                if(currentSheet == null) new ExcelReadingException("No se ha asignado la hoja a trabajar!");
                if(currentRow == null) new ExcelReadingException("No se ha asignado la fila a trabajar!");
                break;
            case WORKBOOK_SHEET_ROW_AND_CELL:
                if(theWorkBook == null) new ExcelReadingException("No se ha asignado el documento!");
                if(currentSheet == null) new ExcelReadingException("No se ha asignado la hoja a trabajar!");
                if(currentRow == null) new ExcelReadingException("No se ha asignado la fila a trabajar!");
                if(currentCell == null) new ExcelReadingException("No se ha asignado la columna a trabajar!");
                break;
            default:
        }
    }

    public void setActiveSheetByNumber(int sheetNumber) {
        validateState(READER_STATE.JUST_WORKBOOK);
        currentSheet = theWorkBook.getSheetAt(sheetNumber);
    }

    public void setActiveSheetByName(String sheetName) {
        validateState(READER_STATE.JUST_WORKBOOK);
        currentSheet = theWorkBook.getSheet(sheetName);
    }

    public int getSheetCount() {
        validateState(READER_STATE.JUST_WORKBOOK);

        if(sheetCount == -1) {
            sheetCount = theWorkBook.getNumberOfSheets();
        }
        
        return sheetCount;
    }

    public String getSheetName() {
        validateState(READER_STATE.WORKBOOK_AND_SHEET);
        return currentSheet.getSheetName();
    }

    public int getColumnCount() {
        validateState(READER_STATE.WORKBOOK_AND_SHEET);
        
        if(columnCount == -1) {
            Row headerRow = currentSheet.getRow(currentSheet.getTopRow());
            columnCount = headerRow.getPhysicalNumberOfCells();
        }
        
        return columnCount;
    }

    public int getRowCount() {
        validateState(READER_STATE.WORKBOOK_AND_SHEET);
        
        if(rowCount == -1) {
            rowCount = currentSheet.getPhysicalNumberOfRows();
        }
        
        return rowCount;
    }

    public void setCurrentCell(int rowNumber, int cellNumber) throws InvalidRowException {
        validateState(READER_STATE.WORKBOOK_AND_SHEET);
        currentRow = currentSheet.getRow(rowNumber);
        if(currentRow == null) {
            throw new InvalidRowException("Indice de fila no valido! Fila solicitada: " + rowNumber);
        } else {
            currentCell = currentRow.getCell(cellNumber);
        }
    }

    public void setCurrentCell(int cellNumber) {
        validateState(READER_STATE.WORKBOOK_SHEET_AND_ROW);
        currentCell = currentRow.getCell(cellNumber);
    }

    public String getStringCellValue(boolean transform, String defaultValue) {
        validateState(READER_STATE.WORKBOOK_SHEET_ROW_AND_CELL);
        String result = "";
        switch(currentCell.getCellType()) {
            case Cell.CELL_TYPE_NUMERIC:
                result = "" + currentCell.getNumericCellValue();
                break;
            case Cell.CELL_TYPE_STRING:
                result = currentCell.getStringCellValue();
                break;
            default:
                result = currentCell.toString();
        }
        return result;
    }
    
    public boolean getBooleanCellValue(boolean transform, String defaultValue) {
        validateState(READER_STATE.WORKBOOK_AND_SHEET);
        return currentCell.getBooleanCellValue();
    }

    public Date getDateCellValue(boolean transform, String defaultValue) {
        validateState(READER_STATE.WORKBOOK_SHEET_ROW_AND_CELL);
        return currentCell.getDateCellValue();
    }
    
    public String getDateCellValue(String dateFormat, String defaultValue) {
        validateState(READER_STATE.WORKBOOK_SHEET_ROW_AND_CELL);
        return ""+currentCell.getDateCellValue();
    }
    
    public Double getNumericCellValue(boolean transform, String defaultValue) {
        validateState(READER_STATE.WORKBOOK_SHEET_ROW_AND_CELL);
        return currentCell.getNumericCellValue();
    }
    
    public BigDecimal getBigDecimalCellValue(boolean transform, String defaultValue) {
        validateState(READER_STATE.WORKBOOK_SHEET_ROW_AND_CELL);
        return new BigDecimal(currentCell.getNumericCellValue());
    }
    
    public Integer getIntegerCellValue(boolean transform, String defaultValue) {
        validateState(READER_STATE.WORKBOOK_SHEET_ROW_AND_CELL);
        return new BigDecimal(currentCell.getNumericCellValue()).intValue();
    }
    
}
