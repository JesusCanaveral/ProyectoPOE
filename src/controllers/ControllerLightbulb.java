/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.FocoInteligente;
import models.ListaEnlazada;

/**
 *
 * @author alvar
 */
public class ControllerLightbulb {
    public static ListaEnlazada listaFoco = new ListaEnlazada();
    
    public static void add(FocoInteligente foco){
        listaFoco.agregar(foco);
    }
    
    public static FocoInteligente search(String ip){
        return (FocoInteligente)listaFoco.buscar(ip);
    }
    
    public static void delete(String ip){
        listaFoco.eliminar(ip);
    }
    
    /*
    public static void edit(String ip, listaFoco nuevo)
    {
        listaFoco.editar(ip, nuevo);
    }
*/
}
