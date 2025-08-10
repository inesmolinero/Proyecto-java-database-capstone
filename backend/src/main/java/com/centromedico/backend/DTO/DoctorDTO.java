package com.centromedico.backend.DTO;


public class DoctorDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private String especialidad;
    private String email;
    private String telefono;
    private String id_localizacion;


    public DoctorDTO() {
    }
    public DoctorDTO(Long id, String nombre, String apellido, String especialidad, String email, String telefono, String id_localizacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.email = email;
        this.telefono = telefono;
        this.id_localizacion = id_localizacion;
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
