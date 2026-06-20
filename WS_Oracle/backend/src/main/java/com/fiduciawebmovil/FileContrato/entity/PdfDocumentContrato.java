package com.fiduciawebmovil.FileContrato.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Pdf_Document_Contrato")
public class PdfDocumentContrato  {
    @EmbeddedId
    private PdfDocumentContratoId id;
    private String filePath;
    private String contentType;
    private String nombre;

}
