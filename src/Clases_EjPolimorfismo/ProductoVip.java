package Clases_EjPolimorfismo;

import ClasesBase.Producto;



public class ProductoVip extends Producto {

    public ProductoVip(int ID,String nombre,String descripcion) {
        super(ID, nombre, descripcion, ID, ID, ID);
    }

    public ProductoVip(int ID, String Nombre, double precio) {
        super(ID, Nombre, Nombre, precio, ID, precio);
    }


    public double calcularPrecio() {
      return calcularIVAEnDolares()*0.15;
    }


    public void entrega() {
        System.out.println("Entrega por Amazon");
    }
}
