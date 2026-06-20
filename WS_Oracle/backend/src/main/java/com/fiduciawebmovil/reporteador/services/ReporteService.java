package com.fiduciawebmovil.reporteador.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fiduciawebmovil.reporteador.entity.Reporte;
import com.fiduciawebmovil.reporteador.repo.ReporteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ReporteService {

    @Autowired
    private ReporteRepository reporteRepository;

    public List<Reporte> obtenerTodos() {
        return reporteRepository.findAll();
    }

    public Optional<Reporte> obtenerPorId(Long id) {
        return reporteRepository.findById(id);
    }

    @Transactional
    public Reporte guardarReporte(Reporte reporte) {
        // Asegura la bidireccionalidad antes de guardar
        if (reporte.getColumnas() != null) {
            reporte.getColumnas().forEach(col -> col.setReporte(reporte));
        }
        return reporteRepository.save(reporte);
    }

    public void eliminarReporte(Long id) {
        reporteRepository.deleteById(id);
    }
}