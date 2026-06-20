package com.fiduciawebmovil.reporteador.controller;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import com.fiduciawebmovil.reporteador.entity.Reporte;
import com.fiduciawebmovil.reporteador.services.ReporteService;

import io.jsonwebtoken.io.IOException;
import jakarta.servlet.http.HttpServletResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/reportes")
@CrossOrigin(origins = "*") // Permitir peticiones desde el frontend
public class ReporteController {

    @Autowired
    private ReporteService reporteService;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @GetMapping
    public List<Reporte> listarReportes() {
        return reporteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reporte> obtenerReporte(@PathVariable Long id) {
        return reporteService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Reporte crearReporte(@RequestBody Reporte reporte) {
        return reporteService.guardarReporte(reporte);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reporte> actualizarReporte(@PathVariable Long id, @RequestBody Reporte reporteDetalles) {
        return reporteService.obtenerPorId(id).map(reporteExistente -> {
            reporteExistente.setNombre(reporteDetalles.getNombre());
            reporteExistente.setDescripcion(reporteDetalles.getDescripcion());
            reporteExistente.setQueryBase(reporteDetalles.getQueryBase());
            
            // Actualizar columnas
            reporteExistente.getColumnas().clear();
            reporteExistente.getColumnas().addAll(reporteDetalles.getColumnas());
            
            Reporte actualizado = reporteService.guardarReporte(reporteExistente);
            return ResponseEntity.ok(actualizado);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarReporte(@PathVariable Long id) {
        reporteService.eliminarReporte(id);
        return ResponseEntity.ok().build();
    }

    /*SECCION PARA CONSTRUIR EL REPORTE DINAMICO Y DESCARGAR EXCEL*/
// 2. Obtener la vista previa de los datos en formato JSON (para la tabla web)
    @GetMapping("/ejecutar/{id}")
    public Map<String, Object> ejecutarReporte(@PathVariable Long id) {
        String query = jdbcTemplate.queryForObject("SELECT query_base FROM CAT_REPORTES WHERE id_reporte = ?", String.class, id);
        List<Map<String, Object>> datos = jdbcTemplate.queryForList(query);
        
        // Obtener columnas dinámicas
        List<Map<String, Object>> columnas = jdbcTemplate.queryForList(
            "SELECT ALIAS_VISUAL, nombre_columna FROM CAT_REPORTES_COLUMNAS WHERE id_reporte = ? ORDER BY orden", id);

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("columnas", columnas);
        respuesta.put("datos", datos);
        return respuesta;
    }

    // 3. Descargar Excel dinámico
    @GetMapping("/excel/{id}")
    public void descargarExcel(@PathVariable Long id, HttpServletResponse response) throws IOException, java.io.IOException {
        String query = jdbcTemplate.queryForObject("SELECT query_base FROM CAT_REPORTES WHERE id_reporte = ?", String.class, id);
        List<Map<String, Object>> datos = jdbcTemplate.queryForList(query);
        
        List<Map<String, Object>> columnas = jdbcTemplate.queryForList(
            "SELECT ALIAS_VISUAL, nombre_columna FROM CAT_REPORTES_COLUMNAS WHERE id_reporte = ? ORDER BY orden", id);

        // Crear archivo Excel usando Apache POI
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Reporte");

        // Crear encabezados
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < columnas.size(); i++) {
            headerRow.createCell(i).setCellValue(columnas.get(i).get("ALIAS_VISUAL").toString());
        }

        // Llenar datos
        int rowIdx = 1;
        for (Map<String, Object> filaDatos : datos) {
            Row row = sheet.createRow(rowIdx++);
            for (int i = 0; i < columnas.size(); i++) {
                String colName = columnas.get(i).get("nombre_columna").toString();
                Object valor = filaDatos.getOrDefault(colName, "");
                row.createCell(i).setCellValue(valor != null ? valor.toString() : "");
            }
        }

        // Configurar respuesta HTTP
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=reporte_" + id + ".xlsx");
        workbook.write(response.getOutputStream());
        workbook.close();
    }    
}