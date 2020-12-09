package com.lalomita.clases;

public class Queja {
    private String numFilialIni;
    private String numFilialDest;
    private String descripcion;
    private String fecha;
    private String estado;
    private String observacion;

    public Queja(){

    }

    public Queja(String numFilialIni, String numFilialDest, String descripcion, String fecha, String estado, String observacion) {
        this.numFilialIni = numFilialIni;
        this.numFilialDest = numFilialDest;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
        this.observacion = observacion;
    }

    public String getNumFilialIni() {
        return numFilialIni;
    }

    public void setNumFilialIni(String numFilialIni) {
        this.numFilialIni = numFilialIni;
    }

    public String getNumFilialDest() {
        return numFilialDest;
    }

    public void setNumFilialDest(String numFilialDest) {
        this.numFilialDest = numFilialDest;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "com.lalomita.clases.Queja{" +
                "numFilialIni=" + numFilialIni +
                ", numFilialDest=" + numFilialDest +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", estado='" + estado + '\'' +
                ", observacion='" + observacion + '\'' +
                '}';
    }
}


