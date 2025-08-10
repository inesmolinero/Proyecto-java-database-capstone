package com.centromedico.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centromedico.backend.DTO.PacienteDTO;
import com.centromedico.backend.model.Paciente;
import com.centromedico.backend.repository.RepositorioDoctor;
import com.centromedico.backend.repository.RepositorioPaciente;

@Service
public class ServicioPaciente {
    @Autowired
    private RepositorioPaciente repositorioPaciente;
    @Autowired
    private RepositorioDoctor repositorioDoctor;

    public int crearPaciente(Paciente paciente) {
        try {
            // Lógica para crear un paciente
            repositorioPaciente.save(paciente);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public PacienteDTO obtenerPacientePorId(Long id) {
        try {
            // Lógica para obtener un paciente por ID
            Optional<Paciente> optionalPaciente = repositorioPaciente.findById(id);
            if (optionalPaciente.isPresent()) {
                Paciente paciente = optionalPaciente.get();
                return new PacienteDTO(paciente);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }   


}