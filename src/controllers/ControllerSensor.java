/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.ListaEnlazada;
import models.SensorTemperatura;

/**
 *
 * @author kechu
 */
public class ControllerSensor {
    public static ListaEnlazada listaSensor = new ListaEnlazada();
    
    public static void add(SensorTemperatura sensorTemperatura){
        listaSensor.agregar(sensorTemperatura);
    }
    
    public static SensorTemperatura search(String ip){
        return (SensorTemperatura)listaSensor.buscar(ip);
    }
    
    public static void delete(String ip){
        listaSensor.eliminar(ip);
    }
    
    public static void edit(String ip, SensorTemperatura nuevo)
    {
        listaSensor.editar(ip, nuevo);
    }
}
