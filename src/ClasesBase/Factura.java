/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesBase;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Factura extends Cliente{
    

    private int numero_factura;
    private int cantidad;
    private double total;
    private int iva;
    private double subtotal;

    public Factura(int numero_factura, int cantidad, double total, int iva, double subtotal, String nombre, String apellido, String cedula, String direccion, String celular, String email) {
        super(nombre, apellido, cedula, direccion, celular, email);
        this.numero_factura = numero_factura;
        this.cantidad = cantidad;
        this.total = total;
        this.iva = iva;
        this.subtotal = subtotal;
    }

    public int getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(int numero_factura) {
        this.numero_factura = numero_factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

   
}
