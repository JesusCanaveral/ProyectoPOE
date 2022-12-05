package models;

import java.awt.*;

public class FocoInteligente extends DispositivoIOT{
    private int intensidadMaxima;  //lumenes
    private int potenciaDeConsumo;  //watts
    private Color rgb;
    private int intensidadRegulada; //lumenes
    private double tiempoDeVida;  //restante estimado

    public FocoInteligente(){  super();  }
    public FocoInteligente(int id, String ip, String estadoActividad, String nombre, String modelo, String versionFirmware, int intensidadMaxima, int potenciaDeConsumo, Color rgb, int intensidadRegulada, double tiempoDeVida) {
        super(id, ip, estadoActividad, nombre, modelo, versionFirmware);
        this.intensidadMaxima = intensidadMaxima;
        this.potenciaDeConsumo = potenciaDeConsumo;
        this.rgb = rgb;
        this.intensidadRegulada = intensidadRegulada;
        this.tiempoDeVida = tiempoDeVida;
    }

    public int getIntensidadMaxima() {
        return intensidadMaxima;
    }

    public void setIntensidadMaxima(int intensidadMaxima) {
        this.intensidadMaxima = intensidadMaxima;
    }

    public int getPotenciaDeConsumo() {
        return potenciaDeConsumo;
    }

    public void setPotenciaDeConsumo(int potenciaDeConsumo) {
        this.potenciaDeConsumo = potenciaDeConsumo;
    }

    public Color getRgb() {
        return rgb;
    }

    public void setRgb(Color rgb) {
        this.rgb = rgb;
    }

    public int getIntensidadRegulada() {
        return intensidadRegulada;
    }

    public void setIntensidadRegulada(int intensidadRegulada) {
        this.intensidadRegulada = intensidadRegulada;
    }

    public double getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(double tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }
}
