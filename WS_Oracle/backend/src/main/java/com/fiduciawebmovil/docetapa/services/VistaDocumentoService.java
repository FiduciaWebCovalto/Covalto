package com.fiduciawebmovil.docetapa.services;
import java.util.List;

import com.fiduciawebmovil.docetapa.entity.VistaDocumento;

public interface VistaDocumentoService {
        
    List<VistaDocumento> buscar(String id);
}
