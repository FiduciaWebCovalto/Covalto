package com.fiduciawebmovil.File.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import com.fiduciawebmovil.File.entity.PdfDocument;
import com.fiduciawebmovil.File.repo.PdfDocumentRepository;
import com.fiduciawebmovil.File.services.FileStorageService;
import com.fiduciawebmovil.plazas.entity.FPlazasBanco;

import jakarta.annotation.Resource;
import jakarta.mail.internet.ContentDisposition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/documentos")
@Slf4j
public class FileController {

    @Autowired
    private FileStorageService fileStorageService;
    
    @Autowired
    private PdfDocumentRepository documentoRepository;

    // Se inyecta la ruta desde application.properties
    @Value("${file.upload-dir}")
    private String storageDirectory;


    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file,@RequestParam("id") Long id ) {
        if (file.isEmpty() || !file.getContentType().equals("application/pdf")) {
            return ResponseEntity.badRequest().body("Solo se permiten archivos PDF.");
        }

        try {
            // 1. Guardar físicamente
            String filePath = fileStorageService.storeFile(file);
            
            // 2. Guardar en BD
            PdfDocument doc = new PdfDocument();
            doc.setFolio(id);
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
    public ResponseEntity<InputStreamResource> viewPdf(@PathVariable("fileName") String fileName) throws IOException {

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
    public List<PdfDocument> findByFplbIdBanco(@RequestParam Long id) {
        return fileStorageService.devuelveArchivo(id);
    }

    @GetMapping("/api/pdf/{id}")
    public ResponseEntity<byte[]> visualizarPdf(@PathVariable Long id) {
        
        PdfDocument archivo = documentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Archivo no encontrado"));

        try {
            // 1. Obtener la ruta del archivo desde la DB
            Path path = Paths.get(archivo.getFilePath());
            byte[] pdfBytes = Files.readAllBytes(path);

            // 2. Configurar cabeceras
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            
            // "inline" permite visualización en navegador. 
            // "attachment" forzaría la descarga.
            headers.setContentDispositionFormData("inline", archivo.getNombre() + ".pdf");
            headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");

            return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);

        } catch (IOException e) {
            log.error("Error al procesar archivo PDF", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}