public class DispositivoIOT {
    private int id;
    private String ip;
    private String estadoActividad;
    private String nombre;
    private String modelo;
    private String versionFirmware;

    DispositivoIOT(){  }
    DispositivoIOT(int id, String ip, String estadoActividad, String nombre, String modelo, String versionFirmware) {
        this.id = id;
        this.ip = ip;
        this.estadoActividad = estadoActividad;
        this.nombre = nombre;
        this.modelo = modelo;
        this.versionFirmware = versionFirmware;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEstadoActividad() {
        return estadoActividad;
    }

    public void setEstadoActividad(String estadoActividad) {
        this.estadoActividad = estadoActividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
