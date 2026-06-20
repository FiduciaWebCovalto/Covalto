package mx.com.inscitech.fiducia.services.impl;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.dml.vo.DataSet;
import mx.com.inscitech.fiducia.services.ExcelDataExporter;
import mx.com.inscitech.fiducia.services.beans.ExcelDatasetExportInfo;
import mx.com.inscitech.fiducia.services.beans.ExcelHeaderInfo;

import mx.com.inscitech.fiducia.common.services.LoggingService;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXDataExporter implements ExcelDataExporter {

    private static LoggingService logger = LoggingService.getNewInstance();

    private ByteArrayOutputStream archivoSalida = null;
    private XSSFWorkbook theExcelWB = null;

    private ArrayList datasets = null;

    private String baseSheetName = "FWData";
    private int sheetNo = 1;

    public XLSXDataExporter() throws FileNotFoundException, IOException {
        super();
        archivoSalida = new ByteArrayOutputStream();
        theExcelWB = new XSSFWorkbook();
        datasets = new ArrayList();
    }

    public void setBaseSheetName(String baseSheetName) {
        this.baseSheetName = baseSheetName;
    }

    public String getBaseSheetName() {
        return baseSheetName;
    }

    public void addDataset(ExcelDatasetExportInfo datasetInfo) {
        datasets.add(datasetInfo);
    }

    public boolean exportDataSets() {
        return exportDataSet(true);
    }

    public boolean exportDataSet(boolean sameSheet) {
        boolean exportedOK = false;

        try {

            for (int i = 0; i < datasets.size(); i++) {
                if (exportDataSet((ExcelDatasetExportInfo) datasets.get(i), sameSheet)) {
                    sheetNo++;
                } else {
                    break;
                }
            }

        } catch (Exception e) {
            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Error al exportar la informacion", e);
        }

        return exportedOK;
    }

    public boolean exportDataSet(ExcelDatasetExportInfo data, boolean sameSheet) {
        boolean exportedOK = false;

        XSSFSheet theSheet = null;
        String sheetName = baseSheetName + sheetNo;
        DataSet theDataSet = null;
        int currentRowExcel = 0;

        try {

            theDataSet = data.getDataset();

            if (data.getSheetName() != null && !"".equals(data.getSheetName())) {
                sheetName = data.getSheetName();
            }

            theSheet = theExcelWB.createSheet(sheetName);

            String[] fields = null;

            if (data.doPrintHeaders()) {
                fields = new String[theDataSet.getRow(0)
                                              .getFieldNames()
                                              .size()];
                XSSFRow theXLSRow = theSheet.createRow(0);
                currentRowExcel++;
                if (data.getHeaderInfo() != null && data.getHeaderInfo().size() > 0) {
                    ArrayList headerInfo = data.getHeaderInfo();
                    for (int h = 0; h < headerInfo.size(); h++) {
                        ExcelHeaderInfo hi = (ExcelHeaderInfo) headerInfo.get(h);
                        theXLSRow.createCell(h).setCellValue(hi.getName());
                        fields[h] = hi.getSource();
                    }
                } else {
                    ArrayList headerInfo = theDataSet.getRow(0).getFieldNames();
                    for (int h = 0; h < headerInfo.size(); h++) {
                        theXLSRow.createCell(h).setCellValue("" + headerInfo.get(h));
                        fields[h] = "" + headerInfo.get(h);
                    }
                }
            }

            for (int i = 0; i < theDataSet.getRowCount(); i++) {
                XSSFRow theXLSRow = theSheet.createRow(i + currentRowExcel);
                DataRow theRow = theDataSet.getRow(i);

                if (fields == null) {
                    fields = new String[theRow.getFieldNames().size()];
                    theRow.getFieldNames().toArray(fields);
                }

                for (int j = 0; j < fields.length; j++) {
                    theXLSRow.createCell(j).setCellValue(theRow.getString(fields[j]));
                }
            }

            exportedOK = true;

        } catch (Exception e) {
            e.printStackTrace();
            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Error al exportar la informacion", e);
        }

        return exportedOK;
    }

    public void writeToSalida() {
        try {
            theExcelWB.write(archivoSalida);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void release() {
        try {

            //theExcelWB.write(archivoSalida);
            archivoSalida.flush();
            archivoSalida.close();

            theExcelWB = null;
            archivoSalida = null;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setArchivoSalida(ByteArrayOutputStream archivoSalida) {
        this.archivoSalida = archivoSalida;
    }

    public ByteArrayOutputStream getArchivoSalida() {
        return archivoSalida;
    }
}
