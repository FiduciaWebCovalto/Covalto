package com.fiduciawebmovil.FileContrato.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fiduciawebmovil.FileContrato.entity.PdfDocumentContrato;
import com.fiduciawebmovil.FileContrato.repo.PdfDocumentContratoRepository;
import com.fiduciawebmovil.fideicom.entity.Fideicom;

import jakarta.annotation.Resource;
import jakarta.transaction.Transactional;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FileStorageServiceContrato {
    
    private final Path fileStorageLocation;
    @Autowired
    private PdfDocumentContratoRepository repositorio;
    // Lee la ruta desde application.properties
    public FileStorageServiceContrato(@Value("${file.upload-dir2}") String uploadDir) {
        this.fileStorageLocation = Paths.get(uploadDir).toAbsolutePath().normalize();
        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo crear el directorio de subida.");
        }
    }

    public String storeFile(MultipartFile file) throws IOException {
        // Generar nombre único para evitar colisiones
        String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        Path targetLocation = this.fileStorageLocation.resolve(fileName);
        Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
        
        return targetLocation.toString();
    }

    public Resource loadFileAsResource(String filePath) throws MalformedURLException {
        Path path = Paths.get(filePath);
        return (Resource) new UrlResource(path.toUri());
    }

    public Optional<PdfDocumentContrato> devuelveArchivo(Long id,Long id2,Long id3){
        return (Optional<PdfDocumentContrato>) 
        repositorio.findByIdFolioAndIdFisoAndIdPersona(id,id2,id3);
    }

    public List<PdfDocumentContrato> buscarDatosDocumentos
    (Long folio,Long fiso,Long persona){
        return (List<PdfDocumentContrato>) 
        repositorio.buscarDatosDocumentos(folio,fiso,persona);
    }
  
}