/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Set;

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

    public void imprimir()
    {
        var aux = primero;
        while (null != aux)
        {
            System.out.println(aux.getIp());
            aux = aux.getSiguiente();
        }
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
}
