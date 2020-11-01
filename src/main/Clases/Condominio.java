public class Condominio {

    private int cedula;
    private String nombreCompleto;
    private int telefono;
    private String numFilial;
    private TIPO_FILIAL tipoFilial;
    private boolean moroso;
    private double pendMes;
    private double pendAgua;
    private double pendAcumMes;
    private double pendAcumAgua;
    private double mntFavor;
    private int cantVehiculo;

    public Condominio() {
    }

    public Condominio(int cedula, String nombreCompleto, int telefono, String numFilial, TIPO_FILIAL tipoFilial, boolean moroso, double pendMes, double pendAgua, double pendAcumMes, double pendAcumAgua, double mntFavor, int cantVehiculo) {
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {

        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNumFilial() {
        return numFilial;
    }

    public void setNumFilial(String numFilial) {
        this.numFilial = numFilial;
    }

    public TIPO_FILIAL getTipoFilial() {
        return tipoFilial;
    }

    public void setTipoFilial(TIPO_FILIAL tipoFilial) {
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
}
