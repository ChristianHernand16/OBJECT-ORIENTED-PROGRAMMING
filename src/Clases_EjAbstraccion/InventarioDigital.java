/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

/**
 *
 * @author chris
 */

package Clases_EjAbstraccion;

import Clases_Abstractas.GestorInventario;

public class InventarioDigital extends GestorInventario {

    public InventarioDigital(int cantidad) {
        super(cantidad);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

    @Override
    public void agregarProducto(String producto, int cantidad) {
        System.out.println("Agregar " + cantidad + " unidades de " + producto + " al inventario digital.");
    }

    @Override
    public void elimiProducto(String producto) {
        System.out.println("Eliminando del inventario digital."+ producto +"");
    }

    @Override
    public void actualizarStock(String producto, int nuevaCantidad) {
        System.out.println("Actualizando stock de  unidades en el inventario digital prodcuto" + producto + " nueva cantidad " + nuevaCantidad + "");
    }
}