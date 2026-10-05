package com.fiduciawebmovil.Excel.services;

import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;

import com.fiduciawebmovil.Excel.entity.FArchivosExcel;
import com.fiduciawebmovil.Excel.repo.FArchivosExcelRepository;
import com.fiduciawebmovil.afidben.repo.AfidbenRepository;
import com.fiduciawebmovil.bienes.entity.FAdquirentes;
import com.fiduciawebmovil.bienes.entity.FAdquirentesId;
import com.fiduciawebmovil.bienes.entity.FBienesgar;
import com.fiduciawebmovil.bienes.entity.FBienesgarId;
import com.fiduciawebmovil.bienes.repo.FAdquirentesRepository;
import com.fiduciawebmovil.bienes.repo.FBienesgarRepository;
import com.fiduciawebmovil.contrato.repo.ContratoRepository;
import com.fiduciawebmovil.detcart.repo.DetcartRepository;
import com.fiduciawebmovil.feccont.entity.Feccont;
import com.fiduciawebmovil.feccont.repo.FeccontRepository;
import com.fiduciawebmovil.unidades.entity.FUnidades;
import com.fiduciawebmovil.unidades.entity.FUnidadesId;
import com.fiduciawebmovil.unidades.repo.FUnidadesRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ExcelService {
    private SimpleJdbcCall simpleJdbcCall;
    private JdbcTemplate jdbcTemplate = new JdbcTemplate();
    @Autowired
    private ContratoRepository contrato;
    @Autowired
    private FeccontRepository feccontrepo;
    @Autowired
    private AfidbenRepository kycrepo;  
    @Autowired
    private DetcartRepository detcart;      
    @Autowired
    private FArchivosExcelRepository reparcexcel;  
    @Autowired
    private FUnidadesRepository repunidades;   
    @Autowired
    private FBienesgarRepository repbienes;

    @Autowired
    private FAdquirentesRepository repadquirentes;
    public String guardarExcel(MultipartFile file, String tipo,String origen,String fecha,String fiso) throws Exception {
        // Lee el archivo .xlsx

        InputStream is = file.getInputStream();
        String nombreArchivo = file.getOriginalFilename();
        Workbook workbook = WorkbookFactory.create(is);
        Sheet sheet = (Sheet) workbook.getSheetAt(0); // Primera hoja
        Map<String, Object> inParams = new HashMap<>();
        String regreso = "",FechaContable="",strContenido="";
        DataFormatter dataFormatter = new DataFormatter();
        double secuencial=0,folio=0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Iterar filas saltando el encabezado (i=1)
        try{
        switch(origen){
            case "1"://honorarios        
                for (int i = 1; i <= sheet.getPhysicalNumberOfRows(); i++) {
                    Row row =sheet.getRow(i);
                    if (row != null) {
                        if (isRowEmpty(row)) continue;
                        /* INICIO VALIDACIONES GENERALES*/ 
                        Cell cellFiso = row.getCell(0, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                        validateCellNotNull(cellFiso, row.getRowNum(), 0);
                        validateCellType(cellFiso, CellType.NUMERIC, row.getRowNum(), 0);
                        Cell cellTipoPers = row.getCell(1, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                        validateCellNotNull(cellTipoPers, row.getRowNum(), 1);
                        validateCellType(cellTipoPers, CellType.STRING, row.getRowNum(), 1);
                        Cell cellNumPers = row.getCell(2, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                        validateCellNotNull(cellNumPers, row.getRowNum(), 2);
                        validateCellType(cellNumPers, CellType.NUMERIC, row.getRowNum(), 2);
                        Cell cellFecha = row.getCell(3, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                        validateCellNotNull(cellFecha, row.getRowNum(), 3);
                        validateCellType(cellFecha, CellType.STRING, row.getRowNum(), 3);
                        
                        Cell cellPeriodoDel = row.getCell(4, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                        log.debug("aNTES DE PERIODOAL:{}", cellPeriodoDel);
                        validateCellNotNull(cellPeriodoDel, row.getRowNum(), 4);
                        /*if (!DateUtil.isCellDateFormatted(cellPeriodoDel)){
                            regreso="Error en el Periodo Del, Linea "+i;
                            break;
                        }*/
                        validateCellType(cellPeriodoDel, CellType.STRING, row.getRowNum(), 4);
                        Cell cellPeriodoAl= row.getCell(5, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                        log.debug("cellPeriodoAl {}", cellPeriodoAl);
                        validateCellNotNull(cellPeriodoAl, row.getRowNum(), 5);
                        validateCellType(cellPeriodoAl, CellType.STRING, row.getRowNum(), 5);
                        
                        Cell cellTipoHon= row.getCell(6, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                        validateCellNotNull(cellTipoHon, row.getRowNum(), 6);
                        validateCellType(cellTipoHon, CellType.STRING, row.getRowNum(), 6);
                        Cell cellNumServicio= row.getCell(7, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                        validateCellNotNull(cellNumServicio, row.getRowNum(), 7);
                        validateCellType(cellNumServicio, CellType.NUMERIC, row.getRowNum(), 7);
                        Cell cellImporte= row.getCell(8, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                        validateCellNotNull(cellImporte, row.getRowNum(), 8);
                        validateCellType(cellImporte, CellType.NUMERIC, row.getRowNum(), 8);
                        Cell cellSecuencial= row.getCell(9, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                        validateCellNotNull(cellSecuencial, row.getRowNum(), 9);
                        validateCellType(cellSecuencial, CellType.NUMERIC, row.getRowNum(), 9);
                        Cell cellFolio= row.getCell(10, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                        validateCellNotNull(cellFolio, row.getRowNum(), 10);
                        validateCellType(cellFolio, CellType.NUMERIC, row.getRowNum(), 10);
                        
                        /* FIN VALIDACIONES GENERALES*/ 
                        //seccion validaciones
                        if(Integer.valueOf(tipo).intValue()<1 && Integer.valueOf(tipo).intValue()>3){
                            regreso="Error de Tipo, Linea "+i;
                            break;
                        }

                        if(Integer.valueOf(tipo).intValue()==1)
                            {
                                secuencial=0;
                                folio=0;
                            }
                        else
                            {
                                secuencial=row.getCell(9).getNumericCellValue();
                                folio=row.getCell(10).getNumericCellValue();
                            }


                        if(!contrato.existsByCtoNumContrato((long) row.getCell(0).getNumericCellValue())){
                            regreso="Error No existe el Fideicomiso, Linea "+i;
                            break;
                        }
                        List<Feccont> listFecha = feccontrepo.findAll();
                        for (Feccont fechaactual : listFecha) {
                            log.debug("Fecha Contable: {}", fechaactual.getFcoFecha());
                            FechaContable=fechaactual.getFcoFecha();
                        }
                        if(!esMismoMes(
                        LocalDate.parse(row.getCell(3).getStringCellValue(), formatter),
                        LocalDate.parse(FechaContable, formatter))
                        ){
                            regreso="Error Las Fecha de aplicacion debe estar dentro del mes, Linea "+i;
                            break;
                        }

                        //revisar si es necesario incluir la etapa de administracion o con esto es suficiente
                        if(!kycrepo.existsByIdAfbAnteproyectoAndIdAfbCvePersonaAndIdAfbNumFidben
                            ((long)row.getCell(0).getNumericCellValue(),
                            row.getCell(1).getStringCellValue(),
                            new BigDecimal(row.getCell(2).getNumericCellValue()))){
                            regreso="Error  La persona no existe en la lista de kyc, Linea "+i;
                            break;
                        }
                        
                        /*if(!detcart.existsByIdDecNumContratoAndIdDecCvePersFidAndIdDecNumPersFidAndIdDecNumSecuencialAndDecFolioOpera
                        ((long)row.getCell(0).getNumericCellValue(),
                        row.getCell(1).getStringCellValue(),
                        new BigDecimal(row.getCell(2).getNumericCellValue()),
                        new BigDecimal(secuencial),
                        new BigDecimal(folio)
                        )&&tipo!=1){
                            regreso="Error El Secuencial y folio no existen en la cartera, Linea "+i;
                            break;
                        }*/

                        if(!detcart.existsByDecFolioOpera(folio)&&Integer.valueOf(tipo).intValue()!=1){
                            regreso="Error El Secuencial y folio no existen en la cartera, Linea "+i;
                            break;
                        }
                        if(Integer.valueOf(tipo).intValue()!=1)
                            if(( (detcart.findImporteFolio((long)folio)).doubleValue()!=
                            row.getCell(8).getNumericCellValue())){
                                log.debug("Importe del pago: {}", detcart.findImporteFolio((long)folio));    
                                log.debug("Importe del archivo {}", row.getCell(8).getNumericCellValue());
                                regreso="Error El importe no coindice con la provision relacionada, Linea "+i;
                                break;
                            }

                        inParams.put("TIPO_OPERACION", tipo);
                        inParams.put("FIDEICOMISO", row.getCell(0).getNumericCellValue());
                        inParams.put("VFECHA", row.getCell(3).getStringCellValue());
                        inParams.put("TIPO_SERVICIO", row.getCell(6).getStringCellValue());
                        inParams.put("VFECHA", row.getCell(3).getStringCellValue());
                        inParams.put("IMPORTE", row.getCell(8).getNumericCellValue());
                        inParams.put("TIPO_PERSONA", row.getCell(1).getStringCellValue());
                        inParams.put("NUM_TIPO_PERSONA", row.getCell(2).getNumericCellValue());
                        inParams.put("VFECHA_ANT", row.getCell(3).getStringCellValue());
                        inParams.put("GL_MESABIERTO", 0);
                        inParams.put("GUSUARIO", 0);
                        inParams.put("VFECHADEL", row.getCell(4).getStringCellValue());
                        inParams.put("VFECHAAL", row.getCell(5).getStringCellValue());
                        inParams.put("SECUENCIAL", row.getCell(9).getNumericCellValue());
                        inParams.put("VFECHAPAGO", row.getCell(3).getStringCellValue());
                        inParams.put("TIPOSERVICIO", row.getCell(6).getStringCellValue());
                        inParams.put("FORMAPAGO", "SPEI");
                        inParams.put("HON_BANCO_TRANSF", 0);
                        inParams.put("HON_CUENTA_NAFIN", 0);
                        inParams.put("HON_REFERENCIA_CIE", 0);
                        inParams.put("INTERNET", 0);
                        inParams.put("CTOINVER", 0);
                        inParams.put("IMPORTEMN", 0);
                        inParams.put("TDC", row.getCell(10).getNumericCellValue());
                        regreso=simpleJdbcCall.executeFunction(String.class, inParams);
                        log.debug("Salida Funcion: {}", regreso);
                    }
                    workbook.close();
                    if (!file.getContentType().equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                        regreso="Formato de archivo inválido. Solo .xlsx";
                        throw new Exception("Formato de archivo inválido. Solo .xlsx");
                    }

                    }//fin de for
                    break;
                case "2"://cuentas individuales
                    if(tipo.equals("CFM")||tipo.equals("CFA")){
                        inParams.put("FECHA_CORTE",fecha);
                        if(tipo.equals("CFM"))
                            regreso=genCifrCtlMCtasIndiv(inParams);
                        else
                            regreso=genCifrCtlACtasIndiv(inParams);
                    }else{
                        //se elimina el contenido de la tabla transitoria
                        reparcexcel.deleteAll();
                        
                        List<FArchivosExcel> empleados = new ArrayList<>();
                        for (int i = 1; i <= sheet.getPhysicalNumberOfRows(); i++) {
                            StringBuilder concatenado = new StringBuilder();
                            strContenido="";
                            Row row =sheet.getRow(i);

                            if (row != null) {
                                if (isRowEmpty(row)) continue;

                                /* INICIO VALIDACIONES GENERALES*/ 
                                //fideicomiso
                                log.debug("Inicio de lectura");
                                Cell cellFiso = row.getCell(0, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                                validateCellNotNull(cellFiso, row.getRowNum(), 0);
                                validateCellType(cellFiso, CellType.NUMERIC, row.getRowNum(), 0);
                                strContenido = dataFormatter.formatCellValue(cellFiso);
                                //concatenado.append(strContenido).append(","); // Puedes cambiar el separador
                                log.debug("Punto1");
                                if(!strContenido.equals(fiso)){
                                    regreso="El Fideicomiso no corresponde con el seleccionado, Linea "+i;
                                    break;                                 
                                }
                                //codigo empleado
                                Cell cellCodigo = row.getCell(1, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                                validateCellNotNull(cellCodigo, row.getRowNum(), 1);
                                validateCellType(cellCodigo, CellType.NUMERIC, row.getRowNum(), 1);
                                strContenido = dataFormatter.formatCellValue(cellCodigo);
                                concatenado.append(strContenido).append(","); // Puedes cambiar el separador
                                log.debug("Punto2");
                                //nombre empleado
                                Cell cellNombreEmp = row.getCell(2, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                                validateCellNotNull(cellNombreEmp, row.getRowNum(), 2);
                                validateCellType(cellNombreEmp, CellType.STRING, row.getRowNum(), 2);
                                strContenido = dataFormatter.formatCellValue(cellNombreEmp);
                                concatenado.append(strContenido).append(","); // Puedes cambiar el separador
                                //Estructura
                                Cell cellEstructura = row.getCell(3, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                                validateCellNotNull(cellEstructura, row.getRowNum(), 3);
                                validateCellType(cellEstructura, CellType.STRING, row.getRowNum(), 3);
                                strContenido = dataFormatter.formatCellValue(cellEstructura);
                                concatenado.append(strContenido).append(","); // Puedes cambiar el separador
                                //AportacionEmpl
                                Cell cellAportaEmp = row.getCell(4, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                                validateCellNotNull(cellAportaEmp, row.getRowNum(), 4);
                                validateCellType(cellAportaEmp, CellType.NUMERIC, row.getRowNum(), 4);
                                strContenido = dataFormatter.formatCellValue(cellAportaEmp).replaceAll("-", "").replaceAll(" ", "").replaceAll(",", "");
                                concatenado.append(strContenido).append(","); // Puedes cambiar el separador
                                //IntEmpl
                                Cell cellIntEmp = row.getCell(5, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                                validateCellNotNull(cellIntEmp, row.getRowNum(), 5);
                                validateCellType(cellIntEmp, CellType.NUMERIC, row.getRowNum(), 5);
                                strContenido = dataFormatter.formatCellValue(cellIntEmp).replaceAll("-", "").replaceAll(" ", "").replaceAll(",", "");
                                concatenado.append(strContenido).append(","); // Puedes cambiar el separador
                                
                                //AporEmpresa
                                Cell cellAporEmpresa = row.getCell(6, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                                validateCellNotNull(cellAporEmpresa, row.getRowNum(), 6);
                                validateCellType(cellAporEmpresa, CellType.NUMERIC, row.getRowNum(), 6);
                                strContenido = dataFormatter.formatCellValue(cellAporEmpresa).replaceAll("-", "").replaceAll(" ", "").replaceAll(",", "");
                                concatenado.append(strContenido).append(","); // Puedes cambiar el separador                            //IntEmpresa
                                Cell cellIntEmpresa = row.getCell(7, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                                validateCellNotNull(cellIntEmpresa, row.getRowNum(), 7);
                                validateCellType(cellIntEmpresa, CellType.NUMERIC, row.getRowNum(), 7);
                                strContenido = dataFormatter.formatCellValue(cellIntEmpresa).replaceAll("-", "").replaceAll(" ", "").replaceAll(",", "");
                                concatenado.append(strContenido).append(","); // Puedes cambiar el separador    
                                // log.debug("Punto2");                         
                                log.debug("Antes de las fechas");
                                //IntFechaCalculo
                                Cell cellIntFechaCalculo = row.getCell(8, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                                if(!validateCellNotNull(cellIntFechaCalculo)){
                                    regreso="Error La Fecha viene vacia, Linea "+i;
                                    break;                                
                                }                            
                                validateCellType(cellIntFechaCalculo, CellType.STRING, row.getRowNum(), 8);
                                if(!esFechaValida(row.getCell(8).getStringCellValue())){
                                    regreso="Error La Fecha tiene formato incorrecto DD/MM/YYYY, Linea "+i;
                                    break;
                                }
                                strContenido = dataFormatter.formatCellValue(cellIntFechaCalculo);
                                concatenado.append(strContenido).append(","); // Puedes cambiar el separador                             //IntFechaIngreso
                                log.debug("Fecha2");
                                Cell cellIntFechaIngreso = row.getCell(9, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                                if(!validateCellNotNull(cellIntFechaIngreso)){
                                    regreso="Error La Fecha viene vacia, Linea "+i;
                                    break;                                
                                }
                                validateCellType(cellIntFechaIngreso, CellType.STRING, row.getRowNum(), 9);
                                if(!esFechaValida(row.getCell(9).getStringCellValue())){
                                    regreso="Error La Fecha tiene formato incorrecto DD/MM/YYYY, Linea "+i;
                                    break;
                                }                          
                                strContenido = dataFormatter.formatCellValue(cellIntFechaIngreso);
                                concatenado.append(strContenido).append(","); // Puedes cambiar el separador                               //IntFechaBaja
                                log.debug("Fecha3");
                                Cell cellIntFechaBaja = row.getCell(10, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                                log.debug("Valor cellIntFechaBaja:{}", cellIntFechaBaja);
                                if(!validateCellNotNull(cellIntFechaBaja)){
                                    regreso="Error La Fecha viene vacia, Linea "+i;
                                    break;
                                }
                                log.debug("Valor cellIntFechaBaja 2:{}", cellIntFechaBaja);
                                validateCellType(cellIntFechaBaja, CellType.STRING, row.getRowNum(), 10);
                                log.debug("Valor Fecha3:{}", cellIntFechaBaja);
                                if(!esFechaValida(row.getCell(10).getStringCellValue())){
                                    regreso="Error La Fecha tiene formato incorrecto DD/MM/YYYY, Linea "+i;
                                    break;
                                }                            
                                strContenido = dataFormatter.formatCellValue(cellIntFechaBaja);
                                concatenado.append(strContenido).append(","); // Puedes cambiar el separador                              //Status
                                log.debug("Status");
                                Cell cellStatus = row.getCell(11, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                                validateCellNotNull(cellStatus, row.getRowNum(), 11);
                                validateCellType(cellStatus, CellType.STRING, row.getRowNum(), 11);
                                strContenido = dataFormatter.formatCellValue(cellStatus);
                                concatenado.append(strContenido).append(","); // Puedes cambiar el separador                              //Concepto
                                Cell cellConcepto= row.getCell(12, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                                validateCellNotNull(cellConcepto, row.getRowNum(), 12);
                                validateCellType(cellConcepto, CellType.NUMERIC, row.getRowNum(), 12);
                                strContenido = dataFormatter.formatCellValue(cellConcepto);
                                concatenado.append(strContenido); // Puedes cambiar el separador   
                                try{    
                                    //SE GRABA EN ARCHIVOS EXCEL TABLA TRANSITORIA
                                    FArchivosExcel tabexcel= new FArchivosExcel();
                                    tabexcel.setAreNomArchivo(null);
                                    tabexcel.setAreTipo(null);
                                    tabexcel.setAreNomArchivo(nombreArchivo);
                                    tabexcel.setAreTipo(Long.parseLong(origen));
                                    tabexcel.setAreContenido(concatenado.toString());
                                    empleados.add(tabexcel);
                                }catch(Exception e){
                                    log.error("Error: ", e);
                                    regreso = "Error en la incorporacion de tabla transitoria.";
                                    break;
                                }
                            }
                            regreso = "0-Carga realizada";  
                            reparcexcel.saveAll(empleados);  
                        }
                        log.debug("Salida Antes Funcion: {}", regreso); 
                        log.debug("Salida Antes Fecha: {}", fecha);
                        log.debug("Salida Antes FIDEICOMISO: {}", fiso);
                        log.debug("Salida Antes TIPOMOV: {}", tipo);
                        log.debug("Salida Antes ARCHIVO: {}", nombreArchivo);
                        if(regreso.contains("0-")){
                            inParams.put("OPCION", 1);
                            inParams.put("SEPARADOR", ",");
                            inParams.put("TIPOMOV", tipo);
                            inParams.put("FECHAMOV2", fecha);
                            inParams.put("FIDEICOMISO", fiso);
                            inParams.put("ARCHIVO", nombreArchivo);
                            regreso=invocarCtasIndiv(inParams);
                        }                        
                    }//fin del else de tipo   
                    log.debug("Salida Funcion: {}", regreso);                      
                    break;
                case "3": //bienes individualizacion y liberacion
                        Iterator<Row> rowIterator = sheet.iterator();
                        List<FUnidades> unidades = new ArrayList<>();
                        List<FAdquirentes> adquirentes = new ArrayList<>();
                        regreso = "0-Carga realizada"; 
                        // Opcional: Saltar la primera fila si tiene encabezados
                        if (rowIterator.hasNext()) rowIterator.next(); 
                    log.debug("Tipo de Carga: {}", tipo);      
                    if(tipo.equals("5")){//Adquirentes
                        for (int i = 1; i <= sheet.getPhysicalNumberOfRows(); i++) {
                            strContenido="";
                            Row row =sheet.getRow(i);

                            if (row != null) {
                                if (isRowEmpty(row)) continue;

                                Cell cell1= row.getCell(0, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                strContenido = dataFormatter.formatCellValue(cell1);
                                if(!strContenido.equals(fiso)){
                                    regreso="300";
                                    break;                                 
                                }                                
                                Cell cell2= row.getCell(1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell3= row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell4= row.getCell(3, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell5= row.getCell(4, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell6= row.getCell(5, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell7= row.getCell(6, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell8= row.getCell(7, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell9= row.getCell(8, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell10= row.getCell(9, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell11= row.getCell(10, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell12= row.getCell(11, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell13= row.getCell(12, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell14= row.getCell(13, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell15= row.getCell(14, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell16= row.getCell(15, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell17= row.getCell(16, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell18= row.getCell(17, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell19= row.getCell(18, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell20= row.getCell(19, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell21= row.getCell(20, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell22= row.getCell(21, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell23= row.getCell(22, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell24= row.getCell(23, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell25= row.getCell(24, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell26= row.getCell(25, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell27= row.getCell(26, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell28= row.getCell(27, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell29= row.getCell(28, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell30= row.getCell(29, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell31= row.getCell(30, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell32= row.getCell(31, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell33= row.getCell(32, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                                Cell cell34= row.getCell(33, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);

                                FAdquirentes registro = new FAdquirentes();
                                FAdquirentesId registroId = new FAdquirentesId(
                                Long.parseLong(dataFormatter.formatCellValue(cell1)),
                                new BigDecimal(dataFormatter.formatCellValue(cell2)),
                                dataFormatter.formatCellValue(cell3),
                                dataFormatter.formatCellValue(cell4),
                                dataFormatter.formatCellValue(cell5));

                                Long existeRegistro = repbienes.
                                existeBien
                                (Long.parseLong(dataFormatter.formatCellValue(cell1)),
                                new BigDecimal(dataFormatter.formatCellValue(cell2)),
                                dataFormatter.formatCellValue(cell3));
                                log.debug("existeRegistro: {}", existeRegistro);
                                //si no existe se rompe el ciclo
                                if(existeRegistro==0){
                                    regreso="301";
                                    break;                                
                                }
                                /*Long bExisteBien=repadquirentes.ExisteBien
                                (Long.parseLong(dataFormatter.formatCellValue(cell1)),
                                Long.parseLong(dataFormatter.formatCellValue(cell2)),
                                dataFormatter.formatCellValue(cell3),
                                dataFormatter.formatCellValue(cell4),
                                dataFormatter.formatCellValue(cell5));
                                if(bExisteBien==0){
                                    regreso="303";
                                    break;                                
                                }*/

                                registro.setId(registroId);
                                registro.setFadqIdVenta(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell6))));
                                registro.setFadqPeriodo(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell7))));
                                registro.setFadqNombreComprador(dataFormatter.formatCellValue(cell8));
                                registro.setFadqValor(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell9))));
                                registro.setFadqMoneda(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell10))));
                                registro.setFadqTipoVenta(dataFormatter.formatCellValue(cell11));
                                registro.setFadqTipoPlazo(dataFormatter.formatCellValue(cell12));
                                registro.setFadqNumPlazo(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell13))));
                                registro.setFadqEnganche(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell14))));
                                registro.setFadqAbono(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell15))));
                                registro.setFadqSaldo(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell16))));
                                registro.setFadqPagos(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell17))));
                                registro.setFadqNotario(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell18))));
                                registro.setFadqLocalidad(dataFormatter.formatCellValue(cell19));
                                registro.setFadqCv(dataFormatter.formatCellValue(cell20));
                                registro.setFadqContrato(dataFormatter.formatCellValue(cell21));
                                registro.setFadqFolio(dataFormatter.formatCellValue(cell22));
                                registro.setFadqRegPub(dataFormatter.formatCellValue(cell23));
                                
                                if(dataFormatter.formatCellValue(cell24).length()>0)
                                    registro.setFadqFecAlta(LocalDate.parse(dataFormatter.formatCellValue(cell24),formatter));                                
                                if(dataFormatter.formatCellValue(cell25).length()>0)
                                    registro.setFadqFecMod(LocalDate.parse(dataFormatter.formatCellValue(cell25),formatter));                                

                                registro.setFadqStatus(dataFormatter.formatCellValue(cell26));
                                registro.setFadqNomComprador(dataFormatter.formatCellValue(cell27));
                                registro.setFadqNumEscrcom(dataFormatter.formatCellValue(cell28));

                                if(dataFormatter.formatCellValue(cell29).length()>0)
                                    registro.setFadqFecEscricom(LocalDate.parse(dataFormatter.formatCellValue(cell29),formatter));                                

                                registro.setFadqExpCatast(dataFormatter.formatCellValue(cell30));
                                registro.setFadqPrototipo(dataFormatter.formatCellValue(cell31));
                                registro.setFadqNumeroOficial(dataFormatter.formatCellValue(cell32));
                                registro.setFadqNotaria(dataFormatter.formatCellValue(cell33));
                                registro.setFadqDelegadoFiduciario(dataFormatter.formatCellValue(cell34));
                                adquirentes.add(registro);
                            }    
                        }    
                        repadquirentes.saveAll(adquirentes); 
                    }else{//individualizacion y liberacion        
                        while (rowIterator.hasNext()) {
                            Row row = rowIterator.next();

                            // Leemos las celdas asegurando que todas se lean como String
                            Cell cell1 = row.getCell(0, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);//fideicomiso
                            strContenido = dataFormatter.formatCellValue(cell1);
                            if(!strContenido.equals(fiso)){
                                regreso="300";
                                break;                                 
                            }
                            Cell cell2 = row.getCell(1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell3 = row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell4 = row.getCell(3, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell5 = row.getCell(4, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell6 = row.getCell(5, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell7 = row.getCell(6, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell8 = row.getCell(7, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell9 = row.getCell(8, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell10 = row.getCell(9, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell11 = row.getCell(10, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell12 = row.getCell(11, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell13 = row.getCell(12, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell14 = row.getCell(13, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell15 = row.getCell(14, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell16 = row.getCell(15, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell17 = row.getCell(16, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell18 = row.getCell(17, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell19 = row.getCell(18, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell20 = row.getCell(19, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell21 = row.getCell(20, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell22 = row.getCell(21, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell23 = row.getCell(22, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell24 = row.getCell(23, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell25 = row.getCell(24, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell26 = row.getCell(25, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell27 = row.getCell(26, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell28 = row.getCell(27, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell29 = row.getCell(28, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell30 = row.getCell(29, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell31 = row.getCell(30, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell32 = row.getCell(31, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell33 = row.getCell(32, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell34 = row.getCell(33, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell35 = row.getCell(34, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell36 = row.getCell(35, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell37 = row.getCell(36, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell38 = row.getCell(37, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell39 = row.getCell(38, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell40 = row.getCell(30, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell41 = row.getCell(40, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell42 = row.getCell(41, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell43 = row.getCell(42, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell44 = row.getCell(43, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            Cell cell45 = row.getCell(44, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            log.debug("{}", dataFormatter.formatCellValue(cell1));
                            log.debug("{}", dataFormatter.formatCellValue(cell2));
                            log.debug("{}", dataFormatter.formatCellValue(cell3));
                            log.debug("{}", dataFormatter.formatCellValue(cell4));
                            log.debug("{}", dataFormatter.formatCellValue(cell5));                            
                            /*FBienesgarId bienes = new FBienesgarId(
                            Long.parseLong(dataFormatter.formatCellValue(cell1)),
                            new BigDecimal(dataFormatter.formatCellValue(cell2)),
                            dataFormatter.formatCellValue(cell3));*/
                            //se valida que exista los bienes registrados
                            Long existeRegistro = repbienes.
                            existeBien
                            (Long.parseLong(dataFormatter.formatCellValue(cell1)),
                            new BigDecimal(dataFormatter.formatCellValue(cell2)),
                            dataFormatter.formatCellValue(cell3));
                            log.debug("existeRegistro: {}", existeRegistro);
                            //si no existe se rompe el ciclo
                            if(existeRegistro==0){
                                log.debug("if existeRegistro: {}", existeRegistro);
                                regreso="301";
                                break;                                
                            }
                            Long bExisteBien=repunidades.ExisteBien
                            (Long.parseLong(dataFormatter.formatCellValue(cell1)),
                            Long.parseLong(dataFormatter.formatCellValue(cell2)),
                            dataFormatter.formatCellValue(cell3),
                            dataFormatter.formatCellValue(cell4),
                            dataFormatter.formatCellValue(cell5));
                            if(bExisteBien==0&&!tipo.equals("1")){
                                log.debug("bExisteBien: {}", existeRegistro);
                                regreso="303";
                                break;                                
                            }
                            String sStatusBien="";
                            if(!tipo.equals("1")){
                                sStatusBien=repunidades.StatusBien
                                (Long.parseLong(dataFormatter.formatCellValue(cell1)),
                                Long.parseLong(dataFormatter.formatCellValue(cell2)),
                                dataFormatter.formatCellValue(cell3),
                                dataFormatter.formatCellValue(cell4),
                                dataFormatter.formatCellValue(cell5));
                            }
                            /*repunidades.StatusBien
                            (Long.parseLong(dataFormatter.formatCellValue(cell1)),
                            Long.parseLong(dataFormatter.formatCellValue(cell2)),
                            dataFormatter.formatCellValue(cell3));*/
                            log.debug("sStatusBien: {}", sStatusBien);
                            if(sStatusBien.equals("COMPROMETIDO")){
                                log.debug("Codigo 302: {}", sStatusBien);
                                regreso="302";
                                break;                                
                            }                            
                            FUnidades registro = new FUnidades();
                            FUnidadesId registroId = new FUnidadesId(
                            Long.parseLong(dataFormatter.formatCellValue(cell1)),
                            Long.parseLong(dataFormatter.formatCellValue(cell2)),
                            dataFormatter.formatCellValue(cell3),
                            dataFormatter.formatCellValue(cell4),
                            dataFormatter.formatCellValue(cell5));

                            registro.setId(registroId);
                            registro.setFuniTipo(dataFormatter.formatCellValue(cell6));
                            registro.setFuniNiveles(dataFormatter.formatCellValue(cell7));
                            registro.setFuniCalleNum(dataFormatter.formatCellValue(cell8));
                            registro.setFuniNomColonia(dataFormatter.formatCellValue(cell9));
                            registro.setFuniNomPoblacion(dataFormatter.formatCellValue(cell10));
                            registro.setFuniCodigoPostal(dataFormatter.formatCellValue(cell11));
                            log.debug("devolverCero: {}", new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell12))));           
                            registro.setFuniNumEstado(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell12))));
                            registro.setFuniNumPais(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell13))));
                            registro.setFuniColindancias(dataFormatter.formatCellValue(cell14));
                            registro.setFuniMedidas(dataFormatter.formatCellValue(cell15));
                            registro.setFuniEstacionamiento1(dataFormatter.formatCellValue(cell16));
                            registro.setFuniSuperficie1(dataFormatter.formatCellValue(cell17));
                            registro.setFuniEstacionamiento2(dataFormatter.formatCellValue(cell18));
                            registro.setFuniSuperficie2(dataFormatter.formatCellValue(cell19));
                            registro.setFuniEstacionamiento3(dataFormatter.formatCellValue(cell20));
                            registro.setFuniSuperficie3(dataFormatter.formatCellValue(cell21));
                            registro.setFuniRoofGarden(dataFormatter.formatCellValue(cell22));
                            registro.setFuniRoofSuperficie(dataFormatter.formatCellValue(cell23));
                            registro.setFuniSotano(dataFormatter.formatCellValue(cell24));
                            registro.setFuniSotanoSuperficie(dataFormatter.formatCellValue(cell25));
                            registro.setFuniIndiviso(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell26))));
                            registro.setFuniPrecio(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell27))));
                            registro.setFuniPrecioCatastro(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell28))));
                            registro.setFuniUltimoAvaluo(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell29))));
                            if(dataFormatter.formatCellValue(cell30).length()>0)
                                registro.setFuniFechaUltimoAvaluo(LocalDate.parse(dataFormatter.formatCellValue(cell30),formatter));
                            registro.setFuniMoneda(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell31))));
                            registro.setFuniActo1(dataFormatter.formatCellValue(cell32));
                            registro.setFuniActo2(dataFormatter.formatCellValue(cell33));
                            registro.setFuniActo3(dataFormatter.formatCellValue(cell34));
                            registro.setFuniActo4(dataFormatter.formatCellValue(cell35));
                            registro.setFuniNotario(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell36))));
                            if(dataFormatter.formatCellValue(cell37).length()>0)
                                registro.setFuniFechaReversion(LocalDate.parse(dataFormatter.formatCellValue(cell37),formatter));
                            registro.setFuniLocalidadNota(dataFormatter.formatCellValue(cell38));
                            registro.setFuniNumEscritura(dataFormatter.formatCellValue(cell39));
                            registro.setFuniFolioReal(dataFormatter.formatCellValue(cell40));
                            if(dataFormatter.formatCellValue(cell41).length()>0)
                                registro.setFuniFechaTrasladoDominio(LocalDate.parse(dataFormatter.formatCellValue(cell41),formatter));
                            if(tipo.equals("1"))
                                if(!dataFormatter.formatCellValue(cell42).equals("ACTIVO")){
                                    regreso="304";
                                    break;                                     
                                }
                                else
                                    registro.setFuniStatus(dataFormatter.formatCellValue(cell42));
                            else
                                registro.setFuniStatus("COMPROMETIDO");
                            registro.setFuniCveGrahipo(new BigDecimal(devolverCero(dataFormatter.formatCellValue(cell43))));
                            registro.setFuniNumHipoteca(dataFormatter.formatCellValue(cell44));
                            registro.setFuniAFavor(dataFormatter.formatCellValue(cell45));

                            unidades.add(registro);
                        }    
                        repunidades.saveAll(unidades); 
                    }//if del tipo unidades o adquirentes     
                    log.debug("Salida Funcion: {}", regreso);           
                    break;
                default:
                    regreso = "0-Opcion incorrecta";
                    break;
                }//fin de switch        
            } catch (Exception e) {
                throw new RuntimeException("Error al procesar el archivo Excel: " + e.getMessage());
            }    
            log.debug("Salida Servlet: {}", regreso);
            if(regreso.contains("0-"))
                return "Archivo Cargado Correctamente";
            else    
                return regreso;
    }
    public boolean esMismoMes(LocalDate fecha1, LocalDate fecha2) {
        return fecha1.getYear() == fecha2.getYear() &&
            fecha1.getMonth() == fecha2.getMonth();
    }
    @Autowired
    public void OracleFunctionService(JdbcTemplate jdbcTemplate) {
        this.simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
            .withCatalogName("OPERATIVAS") // Nombre de tu paquete
            .withFunctionName("GENERA_HONORARIOS"); // Nombre de la función en Oracle
    }
    // Inyección de dependencias de JdbcTemplate
        @Autowired
    public void ServicioFuncionesOracle(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String invocarCtasIndiv(Map<String, Object> params) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withCatalogName("CTAS_INDIV") // Nombre de tu paquete
                .withFunctionName("CARGA_MASIVA_CTAIND");

        MapSqlParameterSource paramSource = new MapSqlParameterSource(params);
        log.debug("Ejecuta funcion");
        // executeFunction retorna directamente el tipo de dato esperado
        return jdbcCall.executeFunction(String.class, paramSource);    
    }

    public String genCifrCtlMCtasIndiv(Map<String, Object> params) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withFunctionName("GENERA_CF_PENSIONES");

        MapSqlParameterSource paramSource = new MapSqlParameterSource(params);
        // executeFunction retorna directamente el tipo de dato esperado
        return jdbcCall.executeFunction(String.class, paramSource);    
    }
    public String genCifrCtlACtasIndiv(Map<String, Object> params) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withFunctionName("GENERA_CF_PENSIONES_ACUMULADO");

        MapSqlParameterSource paramSource = new MapSqlParameterSource(params);
        // executeFunction retorna directamente el tipo de dato esperado
        return jdbcCall.executeFunction(String.class, paramSource);    
    }    
    public void validateCellNotNull(Cell cell, int rowNum, int colNum) throws Exception {
        if (cell == null || cell.getCellType() == CellType.BLANK) {
            throw new Exception("Error en fila " + (rowNum + 1) + ", col " + (colNum + 1) + ": Celda vacía.");
        }
    }

    private boolean validateCellNotNull(Cell cell) {
        if (cell == null) {
            return false;
        }
        
        CellType cellType = cell.getCellType();
        switch (cellType) {
            case STRING:
                // Valida que el texto no sea nulo ni esté vacío o lleno de espacios
                String text = cell.getStringCellValue().trim();
                return !text.isEmpty();
            case BLANK:
                return false;
            case _NONE:
            case ERROR:
                return false;
            default:
                // Para tipos NUMERIC, BOOLEAN, FORMULA, etc.
                return true; 
        }
    }

    public void validateCellType(Cell cell, CellType expectedType, int rowNum, int colNum) throws Exception {
        if (cell.getCellType() != expectedType) {
            throw new Exception("Error en fila " + (rowNum + 1) + ", col " + (colNum + 1) + 
                                ": Tipo de dato inválido. Se esperaba " + expectedType);
        }
    }
    // Verifica si toda la fila está vacía
    public boolean isRowEmpty(Row row) {
        for (int c = row.getFirstCellNum(); c < row.getLastCellNum(); c++) {
            Cell cell = row.getCell(c);
            if (cell != null && cell.getCellType() != CellType.BLANK) {
                return false;
            }
        }
        return true;
    }

    public Date getCellDateValue(Cell cell) {
    if (cell == null) return null;

    if (DateUtil.isCellDateFormatted(cell)) {
        // Validación 1: Es formato fecha, traer valor
         return cell.getDateCellValue();
    } else {
        // Manejar error o convertir de string si es necesario
        throw new IllegalArgumentException("La celda no contiene una fecha válida");
    }
}

    public static boolean esFechaValida(String fechaTexto) {
        // Define el formato esperado
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            // Intenta convertir el String a LocalDate
            LocalDate.parse(fechaTexto, formato);
            return true; // El formato es correcto y la fecha existe
        } catch (DateTimeParseException e) {
            return false; // El formato es incorrecto o la fecha es inválida (ej. 30/02)
        }
    }

    public String devolverCero(String celda) {
    // Si la celda está en blanco (o es nula), retornar 0
    if (celda == null || celda.length()==0) {
        return "0";
    }

    // Retornar el valor numérico si existe
    return celda;
}
}
