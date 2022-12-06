/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

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
    
    public boolean eliminar(String ip)
    {
        var aux = primero;
        while (null != aux)
        {
            var current = aux;
            aux = aux.getSiguiente();
            
            if(null == aux)
            {
                primero = null;
                return true;
            }
            
            if (aux.getIp().equals(ip))
            {
                current.setSiguiente(aux.getSiguiente());
                return true;
            }
        }
        return false;
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
}
