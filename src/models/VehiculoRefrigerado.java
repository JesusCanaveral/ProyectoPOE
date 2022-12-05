public class VehiculoRefrigerado {
    private int id;
    private String modelo;
    private SensorTemperatura sensorTemperatura;
    private GPS gps;
    private ActuadorTemperatura actuadorTemperatura;

    VehiculoRefrigerado(){  }
    VehiculoRefrigerado(int id, String modelo, SensorTemperatura sensorTemperatura, GPS gps, ActuadorTemperatura actuadorTemperatura) {
        this.id = id;
        this.modelo = modelo;
        this.sensorTemperatura = sensorTemperatura;
        this.gps = gps;
        this.actuadorTemperatura = actuadorTemperatura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
