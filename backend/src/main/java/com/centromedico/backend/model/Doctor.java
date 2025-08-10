package com.centromedico.backend.model;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class Doctor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nombre;

    @NotNull
    private String apellido;

    @NotNull
    private String especialidad;

    @NotNull
    @Email
    private String email;

    @Column(unique = true)
    private String telefono;
    
    private String id_localizacion;

    public Doctor() {
    }

    public Doctor(String apellido, String email, String especialidad, Long id, String id_localizacion, String nombre, String telefono) {
        this.apellido = apellido;
        this.email = email;
        this.especialidad = especialidad;
        this.id = id;
        this.id_localizacion = id_localizacion;
        this.nombre = nombre;
        this.telefono = telefono;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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

    public String getId_localizacion() {
        return id_localizacion;
    }

    public void setId_localizacion(String id_localizacion) {
        this.id_localizacion = id_localizacion;
    }


}
