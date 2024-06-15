
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

/**
 *
 * @author chris
 */

package Clases_EjAbstraccion;

import Clases_Abstractas.GestorInventario;

public class InventarioFisico extends GestorInventario {

    public InventarioFisico(int cantidad) {
        super(cantidad);
    }

    @Override
    public void agregarProducto(String producto, int cantidad) {
        System.out.println("Agregar inventario físico cantidad " + cantidad + " producto " + producto);
    }

    @Override
    public void elimiProducto(String producto) {
        System.out.println("Eliminando inventario físico " + producto);
    }

    @Override
    public void actualizarStock(String producto, int nuevaCantidad) {
        System.out.println("Actualizando stock y unidades en el inventario físico producto " + producto + " cantidad " + nuevaCantidad );
    }
}
