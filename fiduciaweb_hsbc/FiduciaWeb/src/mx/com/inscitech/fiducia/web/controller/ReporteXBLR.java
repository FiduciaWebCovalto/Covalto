package mx.com.inscitech.fiducia.web.controller;

import java.util.HashMap;

import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.dml.GenericDML;
import mx.com.inscitech.fiducia.services.ExcelDataExporter;

import mx.com.inscitech.fiducia.services.beans.ExcelDatasetExportInfo;
import mx.com.inscitech.fiducia.services.impl.XLSDataExporter;

import mx.com.inscitech.fiducia.services.impl.XLSXDataExporter;

import mx.com.inscitech.fiducia.common.beans.GenericResponseBean;

import org.springframework.web.servlet.ModelAndView;


public class ReporteXBLR extends ConsultasController {

    private static String FUNCION_SQL = "{? = call REPORTES_CONTA_XBLR.GENERA_REPORTE_XBRL(?, ?)}"; //Fecha y Fideicomiso

    private static String NOMBRE_REPORTE_SQL = "SELECT REF_PERIODO_REPORTE FROM F_REP_XBRL WHERE ROWNUM = 1";

    private List hojasExcel = null;

    public ReporteXBLR() {
        super();
    }

    public ModelAndView ejecutaFuncion(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {

            GenericDML dml = new GenericDML();
            Long helper = new Long("1");

            HashMap exitData = new HashMap();
            exitData.put(helper, new Long(0));
            String fecha = request.getParameter("FECHA");
            String fiso = request.getParameter("FISO");
            exitData = dml.executeCall(FUNCION_SQL, new Object[] { "", fecha, new Long(fiso) }, exitData);

            if (exitData != null && exitData.containsKey(helper)) {
                if (new Long(0).equals(exitData.get(helper))) { //Si es 0 exito
                    return respondObject(response, GenericResponseBean.SUCCESS_BEAN);
                } else {
                    return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, "FIDUCIA-XBLR-03", "No fue posible generar el reporte."));
                }
            } else {
                return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, "FIDUCIA-XBLR-02", "No fue posible generar el reporte."));
            }

        } catch (Exception e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, "FIDUCIA-XBLR-01", e.getMessage()));
        }
    }

    public ModelAndView getReporte(HttpServletRequest request, HttpServletResponse response) throws Exception {

        if (hojasExcel == null)
            return null;

        String fileType = ".xls";

        ServletOutputStream out = null;

        GenericDML dml = new GenericDML();

        //1) Obtener nombre del Reporte
        String excelFileName = dml.getDataRow(NOMBRE_REPORTE_SQL).getString("REF_PERIODO_REPORTE");
        ExcelDataExporter exp = null;

        if ("XLSX".equals(request.getParameter("FORMAT"))) {
            exp = new XLSXDataExporter();
            fileType = ".xlsx";
        } else {
            exp = new XLSDataExporter();
        }

        //2) Obtener los datasets
        BeanReporteXBLRSQL infoHoja = null;
        Iterator infoHojas = hojasExcel.iterator();
        while (infoHojas.hasNext()) {
            infoHoja = (BeanReporteXBLRSQL) infoHojas.next();
            exp.addDataset(new ExcelDatasetExportInfo(dml.getDataSet(infoHoja.getSheetSQL()), infoHoja.getSheetName(), false));
        }

        exp.exportDataSets();
        exp.writeToSalida();

        //3) Enviar el codigo de Excel
        byte[] fileData = exp.getArchivoSalida().toByteArray();

        exp.release();
        exp = null;

        response.setContentLength(fileData.length);
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + excelFileName + fileType + "\"");

        out = response.getOutputStream();
        out.write(fileData);
        out.flush();

        return null;
    }

    public void setHojasExcel(List hojasExcel) {
        this.hojasExcel = hojasExcel;
    }

    public List getHojasExcel() {
        return hojasExcel;
    }
}
