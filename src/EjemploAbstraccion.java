
import Clases_Abstractas.GestorInventario;
import Clases_EjAbstraccion.InventarioDigital;
import Clases_EjAbstraccion.InventarioFisico;
import Clases_EjAbstraccion.InventarioVIP;

public class EjemploAbstraccion {

    public static void main(String[] args) {

// Digital
        GestorInventario inventarioDigital = new InventarioDigital(10);
        System.out.println("Inventario Digital contiene la cantidad de " + inventarioDigital.getCantidad());
        inventarioDigital.agregarProducto("eBook de Python", 50);
        inventarioDigital.elimiProducto("eBook de Python");
        inventarioDigital.actualizarStock("eBook de Python", 25);

        //Fisico
        GestorInventario inventarioFisico = new InventarioFisico(20);
        System.out.println("Inventario Físico contiene la cantidad de " + inventarioFisico.getCantidad());
        inventarioFisico.agregarProducto("Libro de Python", 30);
        inventarioFisico.elimiProducto("Libro de Python");
        inventarioFisico.actualizarStock("Libro de Python", 15);

        //vip
        GestorInventario inventarioVIP = new InventarioVIP(30);
        System.out.println("Inventario VIP contiene la cantidad de " + inventarioVIP.getCantidad());
        inventarioVIP.agregarProducto("Libro BestSeller de Python", 30);
        inventarioVIP.elimiProducto("Libro BestSeller de Python"); 
        inventarioVIP.actualizarStock("Libro BestSeller de Python", 15);

    }
}
