package models;

public class VehiculoRefrigerado {
    private String id;
    private String modelo;
    private SensorTemperatura sensorTemperatura;
    private GPS gps;
    private ActuadorTemperatura actuadorTemperatura;
    private VehiculoRefrigerado siguiente;

    public VehiculoRefrigerado(){  }
    public VehiculoRefrigerado(String id, String modelo, SensorTemperatura sensorTemperatura, GPS gps, ActuadorTemperatura actuadorTemperatura) {
        this.id = id;
        this.modelo = modelo;
        this.sensorTemperatura = sensorTemperatura;
        this.gps = gps;
        this.actuadorTemperatura = actuadorTemperatura;
        this.siguiente = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public VehiculoRefrigerado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(VehiculoRefrigerado siguiente) {
        this.siguiente = siguiente;
    }
    
    public SensorTemperatura getSensorTemperatura() {
        return sensorTemperatura;
    }

    public void setSensorTemperatura(SensorTemperatura sensorTemperatura) {
        this.sensorTemperatura = sensorTemperatura;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    public ActuadorTemperatura getActuadorTemperatura() {
        return actuadorTemperatura;
    }

    public void setActuadorTemperatura(ActuadorTemperatura actuadorTemperatura) {
        this.actuadorTemperatura = actuadorTemperatura;
    }
}
