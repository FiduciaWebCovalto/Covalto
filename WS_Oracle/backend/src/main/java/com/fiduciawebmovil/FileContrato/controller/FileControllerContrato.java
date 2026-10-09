package com.fiduciawebmovil.FileContrato.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import com.fiduciawebmovil.FileContrato.services.FileStorageServiceContrato;
import com.fiduciawebmovil.fideicom.entity.Fideicom;
import com.fiduciawebmovil.FileContrato.entity.PdfDocumentContrato;
import com.fiduciawebmovil.FileContrato.entity.PdfDocumentContratoId;
import com.fiduciawebmovil.FileContrato.repo.PdfDocumentContratoRepository;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/documentos/contrato")
@Slf4j
public class FileControllerContrato {

    @Autowired
    private FileStorageServiceContrato fileStorageService;
    
    @Autowired
    private PdfDocumentContratoRepository documentoRepository;

    // Se inyecta la ruta desde application.properties
    @Value("${file.upload-dir2}")
    private String storageDirectory;


    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file
    ,@RequestParam("id") Long id,@RequestParam("id2") Long id2
    ,@RequestParam("id3") Long id3   ) {
        if (file.isEmpty() || !file.getContentType().equals("application/pdf")) {
            return ResponseEntity.badRequest().body("Solo se permiten archivos PDF.");
        }

        try {
            // 1. Guardar físicamente
            String filePath = fileStorageService.storeFile(file);
            PdfDocumentContratoId llave = new PdfDocumentContratoId(id,id2,id3);
            // 2. Guardar en BD
            PdfDocumentContrato doc = new PdfDocumentContrato();
            doc.setId(llave);
            doc.setNombre(file.getOriginalFilename());
            doc.setFilePath(filePath);
            doc.setContentType(file.getContentType());
            documentoRepository.save(doc);
            
            return ResponseEntity.ok("Archivo subido: " + filePath);
        } catch (IOException e) {
            return ResponseEntity.internalServerError().body("Error al subir archivo");
        }
    }

     @GetMapping("/view/pdf/{fileName:.+}")
    public ResponseEntity<InputStreamResource> viewPdf(
        @PathVariable("fileName") String fileName) throws IOException {

        // 1. Construir la ruta absoluta
        File pdfFile = new File(storageDirectory + fileName);

        if (!pdfFile.exists()) {
            return ResponseEntity.notFound().build();
        }

        InputStreamResource resource = new InputStreamResource(new FileInputStream(pdfFile));

        // 2. Configurar encabezados para visualizar en navegador (inline)
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline;filename=" + pdfFile.getName())
                .contentType(MediaType.parseMediaType("application/pdf"))
                .contentLength(pdfFile.length())
                .body(resource);
    }

    @GetMapping("/{buscar}")
    public Optional<PdfDocumentContrato> findByFplbIdBanco(@RequestParam Long id,
        @RequestParam Long id2,@RequestParam Long id3
    ) {
        return fileStorageService.devuelveArchivo(id,id2,id3);
    }

    @GetMapping("/api/pdf/{id}/{id2}/{id3}")
    public ResponseEntity<byte[]> visualizarPdf(@PathVariable("id") Long id,
        @PathVariable("id2") Long id2,@PathVariable("id3") Long id3
    ) {
        
        PdfDocumentContrato archivo = ((Optional<PdfDocumentContrato>) documentoRepository.
                findByIdFolioAndIdFisoAndIdPersona(id,id2,id3))
                .orElseThrow(() -> new RuntimeException("Archivo no encontrado"));

        try {
            // 1. Obtener la ruta del archivo desde la DB
            Path path = Paths.get(archivo.getFilePath());
            byte[] pdfBytes = Files.readAllBytes(path);

            // 2. Configurar cabeceras
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            
            // "inline" permite visualización en navegador.
            String nombre = archivo.getNombre();
            if (nombre == null || nombre.trim().isEmpty()) {
                nombre = "documento.pdf";
            } else {
                nombre = nombre.trim();
                while (nombre.toLowerCase().endsWith(".pdf.pdf")) {
                    nombre = nombre.substring(0, nombre.length() - 4);
                }
                if (!nombre.toLowerCase().endsWith(".pdf")) {
                    nombre += ".pdf";
                }
            }
            headers.set(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + nombre + "\"");
            headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");

            return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);

        } catch (IOException e) {
            log.error("Error al procesar archivo PDF de contrato", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{buscardatos}/{id}")
    public List<PdfDocumentContrato> buscarDatosDocumentos(
        @RequestParam("id") Long id,@RequestParam("id2") Long id2,
        @RequestParam("id3") Long id3) {
        return fileStorageService.buscarDatosDocumentos(id,id2,id3);
    } 
}