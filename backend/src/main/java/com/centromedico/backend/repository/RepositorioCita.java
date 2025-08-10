package com.centromedico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.centromedico.backend.model.Cita;

@Repository
public interface RepositorioCita extends JpaRepository<Cita, Long>{

}
