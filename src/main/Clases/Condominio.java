import java.util.ArrayList;

public class Condominio {

    private String cedula;
    private String nombreCompleto;
    private String telefono;
    private int numFilial;
    private ArrayList<String> tipoFilial= new ArrayList<String>();
    private boolean moroso;
    private double pendMes;
    private double pendAgua;
    private double pendAcumMes;
    private double pendAcumAgua;
    private double mntFavor;
    private int cantVehiculo;

    public Condominio() {
    }

    public Condominio(String cedula, String nombreCompleto, String telefono, int numFilial, ArrayList<String> tipoFilial, boolean moroso, double pendMes, double pendAgua, double pendAcumMes, double pendAcumAgua, double mntFavor, int cantVehiculo) {
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

    public String getTipoFilial(String filial) {

        int i=this.tipoFilial.indexOf(filial);
        String str = this.tipoFilial.get(i);

        return str;
    }

    public void setTipoFilial(String tipoFilial) {
        this.tipoFilial.add(tipoFilial);

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
        return "Condominio{" +
                "cedula='" + cedula + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", telefono='" + telefono + '\'' +
                ", numFilial=" + numFilial +
                ", tipoFilial=" + tipoFilial +
                ", moroso=" + moroso +
                ", pendMes=" + pendMes +
                ", pendAgua=" + pendAgua +
                ", pendAcumMes=" + pendAcumMes +
                ", pendAcumAgua=" + pendAcumAgua +
                ", mntFavor=" + mntFavor +
                ", cantVehiculo=" + cantVehiculo +
                '}';
    }
}
