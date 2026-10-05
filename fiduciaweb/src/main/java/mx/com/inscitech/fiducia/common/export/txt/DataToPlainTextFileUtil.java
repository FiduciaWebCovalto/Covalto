package mx.com.inscitech.fiducia.common.export.txt;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.dml.vo.DataSet;

public class DataToPlainTextFileUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataToPlainTextFileUtil.class);


    private boolean printHeaders = false;
    private String fieldIdentifier = "";
    private String columnDelimiter = "|";
    private String lineDelimiter = System.getProperty("line.separtor");
    private DataOutputStream fileOut = null;
    private Map<String, TxtDataStructure> textTransformConfig = new HashMap<>();
    private String file;
    private String header;
    private String footer;

    public DataToPlainTextFileUtil(String file, boolean printHeaders, String fieldIdentifier, String columnDelimiter) {
        super();
        this.printHeaders = printHeaders;
        this.fieldIdentifier = fieldIdentifier;
        this.columnDelimiter = columnDelimiter;
        this.file = file;
    }

    public DataToPlainTextFileUtil(String file, boolean printHeaders, String fieldIdentifier, String columnDelimiter, Map<String, TxtDataStructure> textTransformConfig) {
        super();
        this.printHeaders = printHeaders;
        this.fieldIdentifier = fieldIdentifier;
        this.columnDelimiter = columnDelimiter;
        this.textTransformConfig = textTransformConfig;
        this.file = file;
    }

    public void setPrintHeaders(boolean printHeaders) {
        this.printHeaders = printHeaders;
    }

    public boolean isPrintHeaders() {
        return printHeaders;
    }

    public void setFieldIdentifier(String fieldIdentifier) {
        this.fieldIdentifier = fieldIdentifier;
    }

    public String getFieldIdentifier() {
        return fieldIdentifier;
    }

    public void setColumnDelimiter(String columnDelimiter) {
        this.columnDelimiter = columnDelimiter;
    }

    public String getColumnDelimiter() {
        return columnDelimiter;
    }

    public void setLineDelimiter(String lineDelimiter) {
        this.lineDelimiter = lineDelimiter;
    }

    public String getLineDelimiter() {
        return lineDelimiter;
    }

    public void setFileOut(DataOutputStream fileOut) {
        this.fileOut = fileOut;
    }

    public DataOutputStream getFileOut() {
        return fileOut;
    }

    public void setTextTransformConfig(Map<String, TxtDataStructure> textTransformConfig) {
        this.textTransformConfig = textTransformConfig;
    }

    public Map<String, TxtDataStructure> getTextTransformConfig() {
        return textTransformConfig;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getFooter() {
        return footer;
    }

    public void exportDataSet(DataSet dataSet) {
        if (dataSet.getRowCount() <= 0)
            return;

        ArrayList<String> headers = dataSet.getRow(0).getFieldNames();

        try {

            openFile();

            if (header != null && !"".equals(header)) {
                fileOut.writeUTF(header);
                fileOut.writeUTF(lineDelimiter);
            }

            if (printHeaders)
                doPrintHeaders(headers);

            for (DataRow row : dataSet.getRows()) {
                for (String field : row.getFieldNames()) {
                    TxtDataStructure txtDS = textTransformConfig.get(field);
                    if (txtDS != null) {
                        fileOut.writeUTF(String.format("%s%s%s%s", fieldIdentifier, txtDS.getValue(row.getString(field)), fieldIdentifier, columnDelimiter));
                    } else {
                        fileOut.writeUTF(String.format("%s%s%s%s", fieldIdentifier, row.getString(field), fieldIdentifier, columnDelimiter));
                    }
                }

                fileOut.writeUTF(lineDelimiter);
            }

            if (footer != null && !"".equals(footer)) {
                fileOut.writeUTF(footer);
            }

        } catch (Exception e) {

            LOGGER.error("Exception: ", e);

        } finally {
            closeFile();
        }

    }

    private void openFile() throws FileNotFoundException {
        fileOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
    }

    private void closeFile() {
        if (fileOut == null)
            return;
        try {
            fileOut.flush();
            fileOut.close();
        } catch (IOException e) {
            LOGGER.error("Exception: ", e);
        }
    }

    private void doPrintHeaders(ArrayList<String> headers) throws IOException {
        for (String header : headers) {
            fileOut.writeUTF(String.format("%s%s%s%s", fieldIdentifier, header, fieldIdentifier, columnDelimiter));
        }

        fileOut.writeUTF(lineDelimiter);
    }
}
