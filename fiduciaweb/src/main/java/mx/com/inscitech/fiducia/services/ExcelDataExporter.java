package mx.com.inscitech.fiducia.services;

import java.io.ByteArrayOutputStream;



import mx.com.inscitech.fiducia.services.beans.ExcelDatasetExportInfo;



public interface ExcelDataExporter {

    public void setBaseSheetName(String baseSheetName);

    public String getBaseSheetName();

    public void addDataset(ExcelDatasetExportInfo datasetInfo);

    public boolean exportDataSets();

    public boolean exportDataSet(boolean sameSheet);

    public boolean exportDataSet(ExcelDatasetExportInfo data, boolean sameSheet);

    public void writeToSalida();

    public void release();

    public void setArchivoSalida(ByteArrayOutputStream archivoSalida);

    public ByteArrayOutputStream getArchivoSalida();

}
