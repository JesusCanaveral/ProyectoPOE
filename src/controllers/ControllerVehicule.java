/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import models.Cola;
import models.VehiculoRefrigerado;

/**
 *
 * @author kechu
 */
public class ControllerVehicule {
    public static Cola colaVehiculo = new Cola();
    
    public static void add(VehiculoRefrigerado vehiculoRefrigerado)
    {
        colaVehiculo.encolar(vehiculoRefrigerado);
    }
    
    public static VehiculoRefrigerado search(String id){
        return (VehiculoRefrigerado)colaVehiculo.buscar(id);
    }
    
    public static void delete(){
        colaVehiculo.desencolar();
    }
    
    public static ArrayList<VehiculoRefrigerado> list()
    {
        return colaVehiculo.recorrer();
    }
}
