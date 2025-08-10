package com.centromedico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.centromedico.backend.model.Admin;

@Repository
public interface RepositorioAdmin extends JpaRepository<Admin, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario

}
