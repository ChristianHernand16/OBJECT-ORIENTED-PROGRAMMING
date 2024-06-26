package Clases_EjPolimorfismo;

import ClasesBase.Producto2;



//Polimorfismo
public class ProductoFisico extends Producto2 {


    public ProductoFisico(int ID) {
        super(ID);
    }

    public ProductoFisico(int ID, String Nombre, double precio) {
        super(ID, Nombre, precio);
    }

    @Override
    public double calcularPrecio() {
        return this.precio +  this.precio * 0.12;
    }

    @Override
    public void entrega() {
        System.out.println("Entrega por Servi Entrega");
    }
}
