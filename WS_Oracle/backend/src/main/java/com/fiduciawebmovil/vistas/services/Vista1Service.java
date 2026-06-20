package com.fiduciawebmovil.vistas.services;
import java.util.List;

import com.fiduciawebmovil.vistas.entity.Vista1;
import com.fiduciawebmovil.vistas.entity.Vista2;
import com.fiduciawebmovil.vistas.entity.Vista3;
import com.fiduciawebmovil.vistas.entity.Vista4;
import com.fiduciawebmovil.vistas.entity.Vista5;
import com.fiduciawebmovil.vistas.entity.Vista6;
import com.fiduciawebmovil.vistas.entity.VistaCom;
import com.fiduciawebmovil.vistas.entity.VistaMov;

public interface Vista1Service {
        
    List<Vista1> buscar(Long id);
    List<Vista2> buscar2(Long id);
    List<Vista3> buscar3(Long id);
    List<Vista4> buscar4(Long id);
    List<Vista5> buscar5(Long id);
    List<Vista6> buscar6(Long id);
    List<VistaMov> buscar7(Long id);
    List<VistaCom> buscar8(Long id);
}
