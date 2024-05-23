package Clases_EjPolimorfismo;

import ClasesBase.Producto;



public class ProductoDigital extends Producto {

    public ProductoDigital(int Id,String nombre,String descripcion) {
        super(Id, nombre, descripcion, Id, Id, Id);
    }

    public ProductoDigital(int ID, String Nombre, double precio) {
        super(ID, Nombre, Nombre, precio, ID, precio);
    }


    public double calcularPrecio() {

        return calcularIVAEnDolares()*0.10;
    }

    public void entrega() {
        System.out.println("Entrega Digital");
    }
}
