package com.centromedico.backend.model;

public enum Genero {

    MASCULINO,
    FEMENINO,
    OTRO;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
    
}
