/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author kechu
 */
public class ListaEnlazada {
    private DispositivoIOT primero = null;
    
     public void agregar(DispositivoIOT nodo)
    {
        if (null == primero)
        {
            primero = nodo;
            return;
        }

        var aux = primero;
        var pasado = primero.getSiguiente();
        while (null != aux)
        {
            pasado = aux;
            aux = aux.getSiguiente();
        }
        pasado.setSiguiente(nodo);
    }

    public ArrayList<DispositivoIOT> listar()
    {
        var dispositivos = new ArrayList<DispositivoIOT>();
        var aux = primero;
        while (null != aux)
        {
            dispositivos.add(aux);
            aux = aux.getSiguiente();
        }
        return dispositivos;
    }
    
    public void eliminar(String ip)
    {
        var aux = primero;
        if(aux.getIp().equals(ip)){
            primero = primero.getSiguiente();
            return;
        }
        while (null != aux.getSiguiente())
        {
            if(aux.getSiguiente().getIp().equals(ip)){
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
            }
            aux = aux.getSiguiente();
        }
    }

    public DispositivoIOT buscar(String ip)
    {
        var aux = primero;
        while (null != aux)
        {
            if (aux.getIp().equals(ip))
            {
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }
    
    public void editar(String ip, DispositivoIOT nuevo){
        var aux = primero;
        while (null != aux.getSiguiente())
        {
            if (aux.getSiguiente().getIp().equals(ip))
            {
                nuevo.setSiguiente(aux.getSiguiente().getSiguiente());
                aux.setSiguiente(nuevo);
                return;
            }
            aux = aux.getSiguiente();
        }
        primero = nuevo;
    }
    
    public Object [][] toBidimensionalArray(char c){
        var aux = primero;
        int contador = 0;
        while(aux != null){
            aux = aux.getSiguiente();
            contador++;
        }
        Object [][] result = new Object[contador][10];
        switch(c){
            case 'g':
                System.out.println("Aqui ando");
                System.out.println(aux);
                GPS gps = (GPS) primero;
                System.out.println(gps);
                contador = 0;
                while(gps != null){
                    System.out.println(gps.getIp());
                    result[contador][0] = gps.getId();
                    result[contador][1] = gps.getIp();
                    result[contador][2] = gps.getEstadoActividad();
                    result[contador][3] = gps.getNombre();
                    result[contador][4] = gps.getVersionFirmware();
                    result[contador][5] = String.valueOf(gps.getTiempoActualizacion());
                    result[contador][6] = String.valueOf(gps.getLatitud());
                    result[contador][7] = String.valueOf(gps.getLongitud());
                    result[contador][8] = String.valueOf(gps.getPrecision());
                    result[contador][9] = String.valueOf(gps.getTiempoActivo());
                    gps = (GPS) gps.getSiguiente();
                    contador++;
                }
                break;
            case 'f':
                FocoInteligente foco = (FocoInteligente) primero;
                contador = 0;
                while(foco != null){
                    result[contador][0] = foco.getId();
                    result[contador][1] = foco.getIp();
                    result[contador][2] = foco.getEstadoActividad();
                    result[contador][3] = foco.getNombre();
                    result[contador][4] = foco.getVersionFirmware();
                    result[contador][5] = String.valueOf(foco.getIntensidadMaxima());
                    result[contador][6] = String.valueOf(foco.getIntensidadRegulada());
                    result[contador][7] = foco.getRgb().toString();
                    result[contador][8] = String.valueOf(foco.getPotenciaDeConsumo());
                    result[contador][9] = String.valueOf(foco.getTiempoDeVida());
                    foco = (FocoInteligente) foco.getSiguiente();
                    contador++;
                }
                break;
            case 'a': 
                ActuadorTemperatura act = (ActuadorTemperatura) primero;
                contador = 0;
                while(act != null){
                    result[contador][0] = act.getId();
                    result[contador][1] = act.getIp();
                    result[contador][2] = act.getEstadoActividad();
                    result[contador][3] = act.getNombre();
                    result[contador][4] = act.getVersionFirmware();
                    result[contador][5] = String.valueOf(act.getPosicion());
                    result[contador][6] = String.valueOf(act.getTiempoRespuesta());
                    result[contador][7] = String.valueOf(act.getUmbralTemperaturaMinima());
                    result[contador][8] = String.valueOf(act.getUmbralTemperaturaMaxima());
                    result[contador][9] = act.getTipoActuador();
                    act = (ActuadorTemperatura) act.getSiguiente();
                    contador++;
                }
                break;
            case 's': 
                SensorTemperatura sns = (SensorTemperatura) primero;
                contador = 0;
                while(sns != null){
                    result[contador][0] = sns.getId();
                    result[contador][1] = sns.getIp();
                    result[contador][2] = sns.getEstadoActividad();
                    result[contador][3] = sns.getNombre();
                    result[contador][4] = sns.getVersionFirmware();
                    result[contador][5] = String.valueOf(sns.getTemperatura());
                    result[contador][6] = sns.getUnidades();
                    result[contador][7] = String.valueOf(sns.getTemperaturaMaxima());
                    result[contador][8] = String.valueOf(sns.getTemperaturaMinima());
                    result[contador][9] = sns.getTipoSensor();
                    sns = (SensorTemperatura) sns.getSiguiente();
                    contador++;
                }
                break;
        }
        
        
        return result;
    }
}
