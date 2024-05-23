/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Abstractas;

import ClasesBase.*;

/**
 *
 * @author chris
 */
public abstract class GestorInventario {
    
    public int cantidad;
    

    public GestorInventario(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    

    public abstract void agregarProducto(String producto, int cantidad);

    public abstract void elimiProducto(String producto);

    public abstract void actualizarStock(String producto, int nuevaCantidad);
    
}
