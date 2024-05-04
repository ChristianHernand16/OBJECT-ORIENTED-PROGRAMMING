/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Factura {


    

    private double cantidad;
    private double precio;
    private double total;
    private int iva;
    private double subtotalVenta;

    public Factura(double cantidad, double precio, double total, int iva, double subtotalVenta) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
        this.iva = iva;
        this.subtotalVenta = subtotalVenta;
    }
    
}
