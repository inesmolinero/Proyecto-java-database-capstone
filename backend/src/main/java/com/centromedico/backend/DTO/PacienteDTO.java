package com.centromedico.backend.DTO;

import java.util.Date;

import com.centromedico.backend.model.Genero;
import com.centromedico.backend.model.Paciente;


public class PacienteDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Genero genero;
    private String email;
    private String telefono;
    private String direccion;


    
    public PacienteDTO(Long id, String nombre, String apellido, Date fechaNacimiento, Genero genero, String email,
            String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public PacienteDTO(Paciente paciente) {
        this.id = paciente.getId();
        this.nombre = paciente.getNombre();
        this.apellido = paciente.getApellido();
        this.fechaNacimiento = paciente.getFechaNacimiento();
        this.genero = paciente.getGenero();
        this.email = paciente.getEmail();
        this.telefono = paciente.getTelefono();
        this.direccion = paciente.getDireccion();
    }
    public PacienteDTO() {
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
