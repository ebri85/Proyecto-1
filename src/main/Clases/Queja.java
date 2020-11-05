public class Queja {
    private int numFilialIni;
    private int numFilialDest;
    private String descripcion;
    private String fecha;
    private String estado;
    private String observacion;

    public Queja(){

    }

    public Queja(int numFilialIni, int numFilialDest, String descripcion, String fecha, String estado, String observacion) {
        this.numFilialIni = numFilialIni;
        this.numFilialDest = numFilialDest;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
        this.observacion = observacion;
    }

    public int getNumFilialIni() {
        return numFilialIni;
    }

    public void setNumFilialIni(int numFilialIni) {
        this.numFilialIni = numFilialIni;
    }

    public int getNumFilialDest() {
        return numFilialDest;
    }

    public void setNumFilialDest(int numFilialDest) {
        this.numFilialDest = numFilialDest;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "Queja{" +
                "numFilialIni=" + numFilialIni +
                ", numFilialDest=" + numFilialDest +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", estado='" + estado + '\'' +
                ", observacion='" + observacion + '\'' +
                '}';
    }
}


