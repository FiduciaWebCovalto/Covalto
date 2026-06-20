package com.fiduciawebmovil.password.services;

import com.fiduciawebmovil.password.entity.FPpassword;

import java.util.List;

public interface FPpasswordService {
        
    List<FPpassword> findAll();
    
}
