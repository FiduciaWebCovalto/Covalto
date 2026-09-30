package mx.com.inscitech.fiducia.services.beans;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataSet;

public class ExcelDatasetExportInfo {

    private DataSet theDataset = null;
    private String sheetName = "";
    private boolean printHeaders = false;
    private ArrayList headerInfo = null;

    public ExcelDatasetExportInfo(DataSet theDataset, String sheetName) {
        this.theDataset = theDataset;
        this.sheetName = sheetName;
    }

    public ExcelDatasetExportInfo(DataSet theDataset, String sheetName, boolean printHeaders) {
        this.theDataset = theDataset;
        this.sheetName = sheetName;
        this.printHeaders = printHeaders;
    }

    public ExcelDatasetExportInfo(DataSet theDataset, String sheetName, boolean printHeaders, ArrayList headerInfo) {
        this.theDataset = theDataset;
        this.sheetName = sheetName;
        this.printHeaders = printHeaders;
        this.headerInfo = headerInfo;
    }

    public DataSet getDataset() {
        return this.theDataset;
    }

    public String getSheetName() {
        return this.sheetName;
    }

    public boolean doPrintHeaders() {
        return this.printHeaders;
    }

    public ArrayList getHeaderInfo() {
        return this.headerInfo;
    }

    public void addHeaderInfo(ExcelHeaderInfo header) {
        if (headerInfo == null)
            headerInfo = new ArrayList();
        headerInfo.add(header);
    }
}
