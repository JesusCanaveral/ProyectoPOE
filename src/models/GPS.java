package models;

public class GPS extends DispositivoIOT{
    private double latitud;
    private double longitud;
    private double tiempoActivo;
    private double precision;
    private double tiempoActualizacion;

    public GPS(){  super();  }
    public GPS(String versionFirmware, String id, String ip, String estadoActividad, String nombre, String modelo, double latitud, double longitud, double tiempoActivo, double precision, double tiempoActualizacion) {
        super(id, ip, estadoActividad, nombre, modelo, versionFirmware);
        this.latitud = latitud;
        this.longitud = longitud;
        this.tiempoActivo = tiempoActivo;
        this.precision = precision;
        this.tiempoActualizacion = tiempoActualizacion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getTiempoActivo() {
        return tiempoActivo;
    }

    public void setTiempoActivo(double tiempoActivo) {
        this.tiempoActivo = tiempoActivo;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public double getTiempoActualizacion() {
        return tiempoActualizacion;
    }

    public void setTiempoActualizacion(double tiempoActualizacion) {
        this.tiempoActualizacion = tiempoActualizacion;
    }
}
