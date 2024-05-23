/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

/**
 *
 * @author chris
 */

package Clases_EjAbstraccion;

import Clases_Abstractas.GestorInventario;

public class InventarioVIP extends GestorInventario {

    public InventarioVIP(int cantidad) {
        super(cantidad);
    }

    @Override
    public void agregarProducto(String producto, int cantidad) {
      
          System.out.println("Agregar inventario VIP físico cantidad" + cantidad + "producto" + producto);
    }

    @Override
    public void elimiProducto(String producto) {
        
        System.out.println("Eliminando inventario VIP " + producto);
    }

    @Override
    public void actualizarStock(String producto, int nuevaCantidad) {
  
         System.out.println("Actualizando stock de  unidades en el inventario VIP producto" + producto + " nueva cantidad " + nuevaCantidad + "");
    }
}
