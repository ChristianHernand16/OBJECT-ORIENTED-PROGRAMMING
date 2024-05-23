package Clases_EjPolimorfismo;

import ClasesBase.Producto;



public class ProductoFisico extends Producto {

    public ProductoFisico(int ID,String nombre,String descripcion) {
        super(ID, nombre, descripcion, ID, ID, ID);
    }

    public ProductoFisico(int ID, String Nombre, double precio) {
        super(ID, Nombre, Nombre, precio, ID, precio);
    }


    public double calcularPrecio() {
      return calcularIVAEnDolares()*0.12;
    }


    public void entrega() {
        System.out.println("Entrega por Servientrega");
    }
}
