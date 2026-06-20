package com.fiduciawebmovil.File.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.fiduciawebmovil.File.entity.PdfDocument;
@Repository
public interface PdfDocumentRepository  extends JpaRepository<PdfDocument, Long> {

    List<PdfDocument> findByFolio(Long id);
    
}
