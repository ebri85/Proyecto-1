import java.util.Date;

public class Queja {
    private int numFilialIni;
    private int numFilialDest;
    private String descripcion;
    private Date fecha;
    private ESTADO estado;
    private String observacion;

    public Queja(){

    }

    public Queja(int numFilialIni, int numFilialDest, String descripcion, Date fecha, ESTADO estado, String observacion) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ESTADO getEstado() {
        return estado;
    }

    public void setEstado(ESTADO estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}


