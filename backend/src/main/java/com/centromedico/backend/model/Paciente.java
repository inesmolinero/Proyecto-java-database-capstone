package com.centromedico.backend.model;

import java.util.Date;

import com.centromedico.backend.DTO.PacienteDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nombre;
    @NotNull
    private String apellido;
    @NotNull
    private Date fechaNacimiento;
    @NotNull
    private Genero genero;
    @NotNull
    @Email
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String telefono;
    private String direccion;
    

    public Paciente() {
    }   
    public Paciente(Long id, @NotNull String nombre, @NotNull String apellido, @NotNull Date fechaNacimiento, @NotNull Genero genero, @NotNull @Email String email, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Paciente(PacienteDTO pacienteDTO) {
        this.id = pacienteDTO.getId();
        this.nombre = pacienteDTO.getNombre();
        this.apellido = pacienteDTO.getApellido();
        this.fechaNacimiento = pacienteDTO.getFechaNacimiento();
        this.genero = pacienteDTO.getGenero();
        this.email = pacienteDTO.getEmail();
        this.telefono = pacienteDTO.getTelefono();
        this.direccion = pacienteDTO.getDireccion();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
