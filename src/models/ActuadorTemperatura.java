package models;

public class ActuadorTemperatura extends DispositivoIOT{
    private double umbralTemperaturaMinima;
    private double umbralTemperaturaMaxima;
    private float posicion;
    private float tiempoRespuesta;
    private String tipoActuador;

    public ActuadorTemperatura(){  super();  }
    public ActuadorTemperatura(int id, String ip, String estadoActividad, String nombre, String modelo, String versionFirmware, double umbralTemperaturaMinima, double umbralTemperaturaMaxima, float posicion, float tiempoRespuesta, String tipoActuador) {
        super(id, ip, estadoActividad, nombre, modelo, versionFirmware);
        this.umbralTemperaturaMinima = umbralTemperaturaMinima;
        this.umbralTemperaturaMaxima = umbralTemperaturaMaxima;
        this.posicion = posicion;
        this.tiempoRespuesta = tiempoRespuesta;
        this.tipoActuador = tipoActuador;
    }

    public double getUmbralTemperaturaMinima() {
        return umbralTemperaturaMinima;
    }

    public void setUmbralTemperaturaMinima(double umbralTemperaturaMinima) {
        this.umbralTemperaturaMinima = umbralTemperaturaMinima;
    }

    public double getUmbralTemperaturaMaxima() {
        return umbralTemperaturaMaxima;
    }

    public void setUmbralTemperaturaMaxima(double umbralTemperaturaMaxima) {
        this.umbralTemperaturaMaxima = umbralTemperaturaMaxima;
    }

    public float getPosicion() {
        return posicion;
    }

    public void setPosicion(float posicion) {
        this.posicion = posicion;
    }

    public float getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(float tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public String getTipoActuador() {
        return tipoActuador;
    }

    public void setTipoActuador(String tipoActuador) {
        this.tipoActuador = tipoActuador;
    }
}
