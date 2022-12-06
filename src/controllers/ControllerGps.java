/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.GPS;
import models.ListaEnlazada;

/**
 *
 * @author angue
 */
public class ControllerGps {
    public static ListaEnlazada listaGPS = new ListaEnlazada();
    
    public void add(GPS itemGPS){
        listaGPS.agregar(itemGPS);
    }
    
    public GPS search(String ip){
        return (GPS)listaGPS.buscar(ip);
    }
    public void delete(String ip){
        listaGPS.eliminar(ip);
    }
}
