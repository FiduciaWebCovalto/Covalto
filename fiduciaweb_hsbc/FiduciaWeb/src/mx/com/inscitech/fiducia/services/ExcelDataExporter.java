package mx.com.inscitech.fiducia.services;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.dml.vo.DataSet;

import mx.com.inscitech.fiducia.services.beans.ExcelDatasetExportInfo;

import mx.com.inscitech.fiducia.common.services.LoggingService;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

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
