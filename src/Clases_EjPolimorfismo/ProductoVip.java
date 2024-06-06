package Clases_EjPolimorfismo;

import ClasesBase.Producto2;





public class ProductoVip extends Producto2 {

    public ProductoVip(int ID) {
        super(ID);
    }

    public ProductoVip(int ID, String Nombre, double precio, String bonus) {
        super(ID, Nombre, precio);
    }

    @Override
    public double calcularPrecio() {
        return this.precio +  this.precio * 0.20;
    }

    @Override
    public void entrega() {
        System.out.println("Entrega por Servicio VIP");
    }

}
