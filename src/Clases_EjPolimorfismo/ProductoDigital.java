package Clases_EjPolimorfismo;

import ClasesBase.Producto2;





public class ProductoDigital extends Producto2 {

 
    public ProductoDigital(int ID) {
        super(ID);
    }

    public ProductoDigital(int ID, String Nombre, double precio) {
        super(ID, Nombre, precio);
    }

    @Override
    public double calcularPrecio() {
        return this.precio + this.precio * 0.10;
    }

    @Override
    public void entrega() {
        System.out.println("Entrega Digital");
    }
}
