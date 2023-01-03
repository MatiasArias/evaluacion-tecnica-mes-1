package com.pil.moby.evaluacion_tecnica.modelo.pojo;

public class Tecnologia {
    private Long id;
    private String nombre;

    public Tecnologia(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public boolean esIdPar(){
        return (this.id % 2 == 0);
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

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;
        final Tecnologia otro = (Tecnologia) obj;
        if (this.id != otro.id) return false;
        if (otro.id == null)  return false;

        return true;
    }

    @Override
    public String toString() {
        return id + " - " + nombre;
    }
}
