package com.lalomita.clases;


public class Condominio {

    private String cedula;
    private String nombreCompleto;
    private String telefono;
    private int numFilial;
    private String tipoFilial;
    private boolean moroso;
    private double pendMes;
    private double pendAgua;
    private double pendAcumMes;
    private double pendAcumAgua;
    private double mntFavor;
    private int cantVehiculo;

    public Condominio() {
    }

    public Condominio(String cedula, String nombreCompleto, String telefono, int numFilial,String tipoFilial, boolean moroso, double pendMes, double pendAgua, double pendAcumMes, double pendAcumAgua, double mntFavor, int cantVehiculo) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.numFilial = numFilial;
        this.tipoFilial = tipoFilial;
        this.moroso = moroso;
        this.pendMes = pendMes;
        this.pendAgua = pendAgua;
        this.pendAcumMes = pendAcumMes;
        this.pendAcumAgua = pendAcumAgua;
        this.mntFavor = mntFavor;
        this.cantVehiculo = cantVehiculo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {

        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumFilial() {
        return numFilial;
    }

    public void setNumFilial(int numFilial) {
        this.numFilial = numFilial;
    }

    public String getTipoFilial() {
        return tipoFilial;
    }

    public void setTipoFilial(String tipoFilial) {
        this.tipoFilial = tipoFilial;
    }

    public boolean isMoroso() {
        return moroso;
    }

    public void setMoroso(boolean moroso) {
        this.moroso = moroso;
    }

    public double getPendMes() {
        return pendMes;
    }

    public void setPendMes(double pendMes) {
        this.pendMes = pendMes;
    }

    public double getPendAgua() {
        return pendAgua;
    }

    public void setPendAgua(double pendAgua) {
        this.pendAgua = pendAgua;
    }

    public double getPendAcumMes() {
        return pendAcumMes;
    }

    public void setPendAcumMes(double pendAcumMes) {
        this.pendAcumMes = pendAcumMes;
    }

    public double getPendAcumAgua() {
        return pendAcumAgua;
    }

    public void setPendAcumAgua(double pendAcumAgua) {
        this.pendAcumAgua = pendAcumAgua;
    }

    public double getMntFavor() {
        return mntFavor;
    }

    public void setMntFavor(double mntFavor) {
        this.mntFavor = mntFavor;
    }

    public int getCantVehiculo() {
        return cantVehiculo;
    }

    public void setCantVehiculo(int cantVehiculo) {
        this.cantVehiculo = cantVehiculo;
    }

    @Override
    public String toString() {
        return
                "Cedula:" + cedula +','+"\n"+
                "Nombre Completo:" + nombreCompleto +','+"\n"+
                "Telefono:" + telefono +','+"\n"+
                "Numero de Filial:" + numFilial +','+"\n"+
                "Tipo de Filial:" + tipoFilial +','+"\n"+
                "Moroso:" + moroso +','+"\n"+
                "Monto pendiente de Mes:" + pendMes +','+"\n"+
                "Monto pendiente de agua:" + pendAgua +','+"\n"+
                "Monto pendiente cuota acumulado:" + pendAcumMes +','+"\n"+
                "Monto Pendiente Agua Acumulado:" + pendAcumAgua +','+"\n"+
                "Monto a Favor:" + mntFavor +','+"\n"+
                "Cantidad de Vehiculos:" + cantVehiculo ;
    }
}
