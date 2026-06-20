package com.fiduciawebmovil.File.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fiduciawebmovil.File.entity.PdfDocument;
import com.fiduciawebmovil.File.repo.PdfDocumentRepository;
import com.fiduciawebmovil.plazas.entity.FPlazasBanco;

import jakarta.annotation.Resource;
import jakarta.transaction.Transactional;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.*;
import java.util.List;
import java.util.UUID;

@Service
public class FileStorageService {
    
    private final Path fileStorageLocation;
    @Autowired
    private PdfDocumentRepository repositorio;
    // Lee la ruta desde application.properties
    public FileStorageService(@Value("${file.upload-dir}") String uploadDir) {
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

    public List<PdfDocument> devuelveArchivo(Long id){
        return (List<PdfDocument>) 
        repositorio.findByFolio(id);
    }
  
}