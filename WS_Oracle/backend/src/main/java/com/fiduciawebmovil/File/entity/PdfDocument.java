package com.fiduciawebmovil.File.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Pdf_Document")
public class PdfDocument  {
     @Id
     private Long folio;
    private String nombre;
    private String filePath;
    private String contentType;

}
