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
}
