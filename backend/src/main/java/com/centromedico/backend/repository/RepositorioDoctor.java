package com.centromedico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.centromedico.backend.model.Doctor;

@Repository
public interface RepositorioDoctor extends JpaRepository<Doctor, Long> {
    

}
