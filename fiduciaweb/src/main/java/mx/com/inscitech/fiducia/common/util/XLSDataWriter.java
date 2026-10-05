package mx.com.inscitech.fiducia.common.util;

import java.io.ByteArrayOutputStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import mx.com.inscitech.fiducia.common.services.LoggingService;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class XLSDataWriter {
    
    private LoggingService logger = null;
    
    private HSSFWorkbook theXLSX = null;
    private HSSFSheet hojaExcel = null;
    
    private ByteArrayOutputStream outByteStream = null;

    private String[] dataColumns = null;
    
    private int currentRow = 0, currentCell = 0;
    
    public XLSDataWriter() {
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
            
            theXLSX = new HSSFWorkbook();
            
            hojaExcel = theXLSX.createSheet("FiduciaWeb");

            printHeaders = doPrintHeaders(printHeaders, tableHeaders); //Si va a imprimir los headers usando el parametro headers
            printHeaders = doPrintHeaders(printHeaders, dataFields); //Si va a imprimir los headers usando el parametro fields siempre que no se haya especificado el parametro headers
            
            for(Object rowData : resultSet) {
                
                currentCell = 0;
                HashMap<String, Object> recordData = (HashMap<String, Object>)rowData;
                
                if(dataColumns == null) dataColumns = getDataColumns(recordData, dataFields);
                
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
    
    private HSSFCell getExcelCell(HSSFSheet hojaExcel, int row, int cell) {
        HSSFCell theCell = null;
        HSSFRow theRow = null;
        
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
    
    private HSSFRow getExcelRow(HSSFSheet hojaExcel, int row) {
        HSSFRow theRow = null;
        
        theRow = hojaExcel.getRow(row);
        
        if (theRow == null) {
            theRow = hojaExcel.createRow(row);
        }
        
        return theRow;
    }
    
}
