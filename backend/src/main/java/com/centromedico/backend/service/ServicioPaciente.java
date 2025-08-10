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

    public PacienteDTO crearPaciente(PacienteDTO paciente) {
        try {
            // Lógica para crear un paciente
            
            Paciente pacient = repositorioPaciente.save(new Paciente(paciente));
            return new PacienteDTO(pacient);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
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