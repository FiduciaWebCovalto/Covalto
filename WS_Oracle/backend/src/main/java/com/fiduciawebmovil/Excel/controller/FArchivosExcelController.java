package com.fiduciawebmovil.Excel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fiduciawebmovil.Excel.entity.ArchivosPlanosTas;
import com.fiduciawebmovil.Excel.services.ArchivosPlanosTasService;
import com.fiduciawebmovil.Excel.services.ExcelService;

import io.jsonwebtoken.io.IOException;

@RestController
@RequestMapping("/api/excel")
public class FArchivosExcelController {
    @Autowired
    private ExcelService excelService;
    @Autowired
    private ArchivosPlanosTasService servicio;
    private String salida="";

    @GetMapping("/{buscar}")
    public List<ArchivosPlanosTas> list() {
        return servicio.findAll();
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(
            @RequestParam("file") MultipartFile file,
            @RequestParam("id") String id,
            @RequestParam("origen") String origen,
            @RequestParam("fecha") String fecha,
            @RequestParam("fiso") String fiso) throws Exception { // Parámetro extra

        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Seleccione un archivo");
        }

        try {
            salida=excelService.guardarExcel(file, id, origen,fecha,fiso);
            return ResponseEntity.ok(salida.length()==0?
            "Archivo cargado y guardado exitosamente":salida);
        } catch (IOException e) {
            return ResponseEntity.status(500).body("Error al procesar: " + e.getMessage());
        }
    }
}
