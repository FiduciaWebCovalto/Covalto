package com.fiduciawebmovil.personal.repo;

import com.fiduciawebmovil.personal.entity.Personal;

import org.springframework.data.jpa.repository.JpaRepository;
    

public interface PersonalRepository extends JpaRepository<Personal, Long> {
}
