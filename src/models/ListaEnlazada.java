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
            
            aux = aux.getSiguiente();
        }
    }

    public DispositivoIOT buscar(String cuenta, String contrasenia)
    {
        var aux = primero;
        while (null != aux)
        {
            if (true)
            {
                return null;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }
}
