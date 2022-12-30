package com.pil.moby.evaluacion_tecnica.modelo.pojo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Candidato implements Comparable<Candidato> {
    private Long id;
    private String nombre;
    private String apellido;
    private Integer aniosExperiencia;
    private Double pretensionSalarial;
    private List<Tecnologia> tecnologias;

    public Candidato(Long id, String nombre, String apellido,
                     Integer aniosExperiencia, Double pretensionSalarial,
                     List<Tecnologia> tecnologias) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.aniosExperiencia = aniosExperiencia;
        this.pretensionSalarial = pretensionSalarial;
        this.tecnologias = tecnologias;
    }

    public List<Tecnologia> ordenarTecnologias(){
        return tecnologias.stream().sorted(Comparator.comparing(Tecnologia::getNombre)).toList();
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

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Double getPretensionSalarial() {
        return pretensionSalarial;
    }

    public void setPretensionSalarial(Double pretensionSalarial) {
        this.pretensionSalarial = pretensionSalarial;
    }

    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        final Candidato otro = (Candidato) obj;
        if (this.id != otro.id) {
            return false;
        }
        if (otro.id == null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + " - " + nombre +" "+ apellido +" - Años experiencia: "+ aniosExperiencia +
                " - Pretension Salarial: $" + pretensionSalarial + "\n\t Tecnologias: " + tecnologias;
    }

    @Override
    public int compareTo(Candidato c) {
        if (this.getId()>c.getId()) {
            return 1;
        }else if (this.getId()<c.getId()) {
            return -1;
        }else {
            return 0;
        }
    }
}
