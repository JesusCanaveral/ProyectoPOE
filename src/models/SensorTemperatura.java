public class SensorTemperatura extends DispositivoIOT{
    private double temperatura;
    private String unidades;
    private double temperaturaMinima;
    private double temperaturaMaxima;
    private String tipoSensor;

    SensorTemperatura(){  super();  }
    SensorTemperatura(String versionFirmware, int id, String ip, String estadoActividad, String nombre, String modelo, double temperatura, String unidades, double temperaturaMinima, double temperaturaMaxima, String tipoSensor) {
        super(id, ip, estadoActividad, nombre, modelo, versionFirmware);
        this.temperatura = temperatura;
        this.unidades = unidades;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.tipoSensor = tipoSensor;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }
}
