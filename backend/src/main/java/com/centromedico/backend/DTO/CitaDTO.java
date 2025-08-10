package com.centromedico.backend.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.centromedico.backend.model.Cita;

public class CitaDTO {

    private Long id;

    private Long idDoctor;

    private String nombreDoctor;

    private Long idPaciente;

    private String nombrePaciente;

    private String emailPaciente;

    private String tlfPaciente;

    private String direccionPaciente;

    private LocalDateTime fechaHoraCita;

    private int status; // 0: Pendiente, 1: Confirmada, 2: Cancelada

    private LocalDate fechaCita;

    private LocalTime horaCita;

    public CitaDTO(Long id, Long idDoctor, String nombreDoctor, Long idPaciente, String nombrePaciente,
                   String emailPaciente, String tlfPaciente, String direccionPaciente,
                   LocalDateTime fechaHoraCita, int status) {
        this.id = id;
        this.idDoctor = idDoctor;
        this.nombreDoctor = nombreDoctor;
        this.idPaciente = idPaciente;
        this.nombrePaciente = nombrePaciente;
        this.emailPaciente = emailPaciente;
        this.tlfPaciente = tlfPaciente;
        this.direccionPaciente = direccionPaciente;
        this.fechaHoraCita = fechaHoraCita;
        this.status = status;
        this.fechaCita = fechaHoraCita.toLocalDate();
        this.horaCita = fechaHoraCita.toLocalTime();
    }

    public CitaDTO(Cita cita) {
        this.id = cita.getId();
        this.idDoctor = cita.getDoctor().getId();
        this.nombreDoctor = cita.getDoctor().getNombre();
        this.idPaciente = cita.getPaciente().getId();
        this.nombrePaciente = cita.getPaciente().getNombre();
        this.emailPaciente = cita.getPaciente().getEmail();
        this.tlfPaciente = cita.getPaciente().getTelefono();
        this.direccionPaciente = cita.getPaciente().getDireccion();
        this.fechaHoraCita = cita.getFechaHora();
        this.status = cita.getStatus();
        this.fechaCita = cita.getFechaHora().toLocalDate();
        this.horaCita = cita.getFechaHora().toLocalTime();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Long idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getEmailPaciente() {
        return emailPaciente;
    }

    public void setEmailPaciente(String emailPaciente) {
        this.emailPaciente = emailPaciente;
    }

    public String getTlfPaciente() {
        return tlfPaciente;
    }

    public void setTlfPaciente(String tlfPaciente) {
        this.tlfPaciente = tlfPaciente;
    }

    public String getDireccionPaciente() {
        return direccionPaciente;
    }

    public void setDireccionPaciente(String direccionPaciente) {
        this.direccionPaciente = direccionPaciente;
    }

    public LocalDateTime getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(LocalDateTime fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public LocalTime getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(LocalTime horaCita) {
        this.horaCita = horaCita;
    }

    



}
