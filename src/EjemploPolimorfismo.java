import Clases_EjPolimorfismo.ProductoDigital;
import Clases_EjPolimorfismo.ProductoFisico;
import Clases_EjPolimorfismo.ProductoVip;

public class EjemploPolimorfismo {
    public static void main(String[] args) {

        ProductoDigital productoDigital = new ProductoDigital(1, "Membresìa InternetStarplus", 100);
        System.out.println("Precio Producto Digital " +  productoDigital.calcularPrecio()); //10%
        productoDigital.entrega();
        
        
        ProductoFisico productoFisico= new ProductoFisico(2, "TV100 pulgadas", 100);
        System.out.println("Precio Producto Fìsico " +   productoFisico.calcularPrecio());  //12%
        productoFisico.entrega();
        
        
        
        //ProductoVip productoVip=new ProductoVip(3, "Macbook", 100);
        
        //System.out.println("Precio Producto Vip " +  productoVip.calcularPrecio()); //15%
        //productoVip.entrega();
    }
}