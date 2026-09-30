package mx.com.inscitech.fiducia.common.util;

import java.io.ByteArrayOutputStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import mx.com.inscitech.fiducia.common.services.LoggingService;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXDataWriter {
    
    private LoggingService logger = null;
    
    private XSSFWorkbook theXLSX = null;    
    private XSSFSheet hojaExcel = null;
    
    private String[] dataColumns = null;
    
    private ByteArrayOutputStream outByteStream = null;
    
    private int currentRow = 0, currentCell = 0;
    
    public XLSXDataWriter() {
        super();
        logger = LoggingService.getInstance();
    }

    public ByteArrayOutputStream generateExcel(List resultSet, String[] tableHeaders) {
        return generateExcel(resultSet, tableHeaders, new String[]{}, (tableHeaders != null && tableHeaders.length > 0));
    }
    
    public ByteArrayOutputStream generateExcel(List resultSet, String[] tableHeaders, String[] dataFields) {
        boolean printHeaders = (tableHeaders != null && tableHeaders.length > 0) || (dataFields != null && dataFields.length > 0);
        return generateExcel(resultSet, tableHeaders, dataFields, printHeaders);
    }
    
    public ByteArrayOutputStream generateExcel(List resultSet, String[] tableHeaders, String[] dataFields, boolean printHeaders) {
        
        try {
            
            theXLSX = new XSSFWorkbook();            
            hojaExcel = theXLSX.createSheet("FiduciaWeb");
            
            printHeaders = doPrintHeaders(printHeaders, tableHeaders); //Si va a imprimir los headers usando el parametro headers
            printHeaders = doPrintHeaders(printHeaders, dataFields); //Si va a imprimir los headers usando el parametro fields siempre que no se haya especificado el parametro headers
            
            for(Object rowData : resultSet) {
                
                HashMap<String, Object> recordData = (HashMap<String, Object>)rowData;
                
                if(dataColumns == null) dataColumns = getDataColumns(recordData, dataFields);

                if(printHeaders) {
                    printHeaders = doPrintHeaders(printHeaders, dataColumns);
                }
                                
                for(String colName : dataColumns) {
                    getExcelCell(hojaExcel, currentRow, currentCell).setCellValue(""+recordData.get(colName));
                    currentCell++;
                }
                
                currentRow++;
            }
                
            outByteStream = new ByteArrayOutputStream();
            theXLSX.write(outByteStream);
            outByteStream.flush();
            
        } catch(Exception e) {
            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Error al exportar la consulta a Excel(XLSX). Error: [" + e.getMessage() + "]");
            logger.log(this, Thread.currentThread(), LoggingService.ERROR, e);
        }
        
        return outByteStream;
    }
    
    private boolean doPrintHeaders(boolean printHeaders, String[] headers) {
        currentCell = 0;
        if(printHeaders && headers != null && headers.length > 0) {
            for(String header : headers) {
                getExcelCell(hojaExcel, 0, currentCell).setCellValue(header);
                currentCell++;
            }
            
            currentCell = 0;
            currentRow = 1;
            
            return false;
        }                
        return printHeaders;
    }
    
    private String[] getDataColumns(HashMap<String, Object> recordData, String[] dataFields) {        
        if(dataFields != null && dataFields.length > 0) {
            return dataFields;    
        }
        
        List<String> columns = new ArrayList<>();
        for(String colName : recordData.keySet()) {
            columns.add(colName);
        }

        return columns.toArray(new String[0]);
    }
    
    private Cell getExcelCell(XSSFSheet hojaExcel, int row, int cell) {
        Cell theCell = null;
        Row theRow = null;
        
        theRow = hojaExcel.getRow(row);
        if (theRow == null) {
            theRow = getExcelRow(hojaExcel, row);
        }
        
        theCell = theRow.getCell(cell);
        if (theCell == null) {
            theCell = theRow.createCell(cell);
        }
        
        return theCell;
    }
    
    private Row getExcelRow(XSSFSheet hojaExcel, int row) {
        Row theRow = null;
        
        theRow = hojaExcel.getRow(row);
        
        if (theRow == null) {
            theRow = hojaExcel.createRow(row);
        }
        
        return theRow;
    }
    
}
