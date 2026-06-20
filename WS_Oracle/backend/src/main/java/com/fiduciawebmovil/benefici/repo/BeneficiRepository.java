package com.fiduciawebmovil.benefici.repo;

import com.fiduciawebmovil.benefici.entity.Benefici;
import com.fiduciawebmovil.benefici.entity.BeneficiId;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BeneficiRepository extends JpaRepository<Benefici, BeneficiId> {

    //List<Benefici> findByBenNumContrato(Long benNumContrato);
    List<Benefici> findByIdBenNumContrato(Long benNumContrato);
    List<Benefici> findByIdBenNumContratoAndBenNomBenef(Long benNumContrato,String benNomBenef);
    

}
