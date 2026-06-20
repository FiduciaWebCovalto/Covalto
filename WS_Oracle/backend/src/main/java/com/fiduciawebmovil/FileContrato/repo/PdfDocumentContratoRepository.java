package com.fiduciawebmovil.FileContrato.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fiduciawebmovil.FileContrato.entity.PdfDocumentContrato;
import com.fiduciawebmovil.FileContrato.entity.PdfDocumentContratoId;
@Repository
public interface PdfDocumentContratoRepository 
 extends JpaRepository<PdfDocumentContrato, PdfDocumentContratoId> {

    Optional<PdfDocumentContrato> 
    findByIdFolioAndIdFisoAndIdPersona(Long id, Long id2,Long id3);
    
    @Query(value = "SELECT * FROM PDF_DOCUMENT_CONTRATO p " +
                   "WHERE p.folio = :folio " +
                   "AND p.fiso = :fiso " +
                   "AND p.persona = :persona", 
           nativeQuery = true)
    List<PdfDocumentContrato> buscarDatosDocumentos(
        @Param("folio") Long folio,
        @Param("fiso") Long fiso,
        @Param("persona") Long persona
    );

    
}
