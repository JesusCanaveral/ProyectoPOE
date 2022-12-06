/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.ActuadorTemperatura;
import models.ListaEnlazada;

/**
 *
 * @author kechu
 */
public class ControllerActuator {
    public static ListaEnlazada listaActuador = new ListaEnlazada();
    
    public static void add(ActuadorTemperatura actuator){
        listaActuador.agregar(actuator);
    }
    
    public static ActuadorTemperatura search(String ip){
        return (ActuadorTemperatura)listaActuador.buscar(ip);
    }
    
    public static void delete(String ip){
        listaActuador.eliminar(ip);
    }
    
    public static void edit(String ip, ActuadorTemperatura nuevo)
    {
        listaActuador.editar(ip, nuevo);
    }
}
