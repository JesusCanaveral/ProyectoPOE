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
public class Cola {
    private VehiculoRefrigerado primero;

    public Cola()
    {
        this.primero = null;
    }

    public void encolar(VehiculoRefrigerado vehiculo)
    {
        if (null == this.primero)
        {
            this.primero = vehiculo;
            return;
        }

        var copy = this.primero;
        while (null != copy.getSiguiente())
        {
            copy = copy.getSiguiente();
        }
        copy.setSiguiente(vehiculo);
    }

    public void desencolar()
    {
        if (null == this.primero)
        {
            return;
        }
        var siguiente = this.primero.getSiguiente();
        this.primero = siguiente;
    }
    
    public VehiculoRefrigerado buscar(String id)
    {
        var copy = this.primero;
        while (null != copy)
        {
            if(copy.getId().equals(id))
            {
                return copy;
            }
            copy = copy.getSiguiente();
        }
        return null;
    }

    public ArrayList<VehiculoRefrigerado> recorrer()
    {
        var vehiculos = new ArrayList<VehiculoRefrigerado>();
        var copy = this.primero;
        while (null != copy)
        {
            vehiculos.add(copy);
            
            System.out.println(copy.getId());
            System.out.println(copy.getModelo());
            
            copy = copy.getSiguiente();
        }
        return vehiculos;
    }
    
    public void editar(String ip, VehiculoRefrigerado nuevo){
        var aux = primero;
        while (null != aux.getSiguiente())
        {
            if (aux.getSiguiente().getId().equals(ip))
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
        Object [][] result = new Object[contador][5];
        aux = primero;
        contador = 0;
        while(aux != null){
            result[contador][0] = aux.getId();
            result[contador][1] = aux.getModelo();
            result[contador][2] = aux.getGps().getNombre() + " - " + aux.getGps().getId();
            result[contador][3] = aux.getSensorTemperatura().getNombre() + " - " + aux.getSensorTemperatura().getId();
            result[contador][4] = aux.getActuadorTemperatura().getNombre() + " - " + aux.getActuadorTemperatura().getId();
            aux = aux.getSiguiente();
            contador++;
        }
        return result;
    }
}
