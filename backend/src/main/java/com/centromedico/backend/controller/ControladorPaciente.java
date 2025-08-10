package com.centromedico.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centromedico.backend.DTO.PacienteDTO;
import com.centromedico.backend.service.ServicioPaciente;

@RestController
@RequestMapping("/api/pacientes")
public class ControladorPaciente {

    @Autowired
    private ServicioPaciente servicioPaciente;


    @PostMapping("/")
    public ResponseEntity<PacienteDTO> crearPaciente(@RequestBody PacienteDTO paciente) {

        PacienteDTO nuevoPaciente = servicioPaciente.crearPaciente(paciente);
        if (nuevoPaciente == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(nuevoPaciente);

    }

    

}
