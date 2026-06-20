package mx.com.inscitech.fiducia.common.util;
import java.io.File;

import java.math.BigDecimal;

import java.util.Date;

public interface ExcelDataReader {

    public void openWorkBook(String filePath) throws ExcelReadingException;
    
    public void openWorkBook(File theFile) throws ExcelReadingException;

    public void closeWorkBook();

    public void setActiveSheetByNumber(int sheetNumber);

    public void setActiveSheetByName(String sheetName);

    public int getSheetCount();

    public String getSheetName();

    public int getColumnCount();

    public int getRowCount();

    public void setCurrentCell(int rowNumber, int cellNumber) throws InvalidRowException;

    public void setCurrentCell(int cellNumber);
    
    public String getStringCellValue(boolean transform, String defaultValue);
    
    public boolean getBooleanCellValue(boolean transform, String defaultValue);

    public Date getDateCellValue(boolean transform, String defaultValue);
    
    public String getDateCellValue(String dateFormat, String defaultValue);
    
    public Double getNumericCellValue(boolean transform, String defaultValue);
    
    public BigDecimal getBigDecimalCellValue(boolean transform, String defaultValue);
    
    public Integer getIntegerCellValue(boolean transform, String defaultValue);
    
    @SuppressWarnings("oracle.jdeveloper.java.inner-class-serializable")
    public class ExcelReadingException extends Exception {
        @SuppressWarnings("compatibility:-4731371364421366701")
        private static final long serialVersionUID = 6255548574493580007L;

        public ExcelReadingException() {
            super();
        }
        
        public ExcelReadingException(String message) {
            super(message);
        }
        
        public ExcelReadingException(Throwable ex) {
            super(ex);
        }
        
        public ExcelReadingException(String message, Throwable ex) {
            super(message, ex);
        }
        
    }

    @SuppressWarnings("oracle.jdeveloper.java.inner-class-serializable")
    public class InvalidRowException extends Exception {
        @SuppressWarnings("compatibility:3635653434519335538")
        private static final long serialVersionUID = -6381876853602068747L;

        public InvalidRowException() {
            super();
        }
        
        public InvalidRowException(String message) {
            super(message);
        }
        
        public InvalidRowException(Throwable ex) {
            super(ex);
        }
        
        public InvalidRowException(String message, Throwable ex) {
            super(message, ex);
        }
        
    }
}
