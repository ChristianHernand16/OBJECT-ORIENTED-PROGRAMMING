import Clases_EjPolimorfismo.ProductoDigital;
import Clases_EjPolimorfismo.ProductoFisico;
import Clases_EjPolimorfismo.ProductoVip;

public class EjemploPolimorfismo {
    public static void main(String[] args) {

        ProductoDigital productoDigital = new ProductoDigital(1, "Perfume CALVIN KLEIN Escape men EDT ", 100);
        System.out.println("Precio Producto Digital Perfume CALVIN KLEIN Escape men EDT el precio es " + productoDigital.calcularPrecio());
        productoDigital.entrega();

        ProductoFisico productoFisico = new ProductoFisico(2, "HUGO BOSS Intense EDP", 100);
        System.out.println("Precio Producto Fìsico HUGO BOSS Intense EDP el precio es " + productoFisico.calcularPrecio());
        productoFisico.entrega();

        ProductoVip productovp = new ProductoVip(3, "Perfume Carolina Herrera 212 Heroes Men EDT ", 120.9, "100");

        System.out.println("Precio Producto Vip Carolina Herrera 212 Heroes Men EDT el precio es " + productovp.calcularPrecio());
        productovp.entrega();
    }
}
