
import Clases_Abstractas.GestorInventario;
import Clases_EjAbstraccion.InventarioDigital;
import Clases_EjAbstraccion.InventarioFisico;
import Clases_EjAbstraccion.InventarioVIP;

public class EjemploAbstraccion {

    public static void main(String[] args) {

        System.out.println("_____________________________________________________________________");
        GestorInventario inventarioDigital = new InventarioDigital(10);
        System.out.println("Inventario Digital contiene la cantidad de " + inventarioDigital.getCantidad());
        inventarioDigital.agregarProducto("Membresia Perfume CALVIN KLEIN Escape men EDT ", 50);
        inventarioDigital.elimiProducto("Membresia Perfume CALVIN KLEIN Escape men EDT ");
        inventarioDigital.actualizarStock("Membresia Perfume CALVIN KLEIN Escape men EDT ", 20);
        System.out.println("_____________________________________________________________________");

        System.out.println("_____________________________________________________________________");
        GestorInventario inventarioFisico = new InventarioFisico(20);
        System.out.println("Inventario Físico contiene la cantidad de " + inventarioFisico.getCantidad());
        inventarioFisico.agregarProducto("HUGO BOSS Intense EDP", 30);
        inventarioFisico.elimiProducto("HUGO BOSS Intense EDP");
        inventarioFisico.actualizarStock("HUGO BOSS Intense EDP", 15);
        System.out.println("_____________________________________________________________________");

        System.out.println("_____________________________________________________________________");
        GestorInventario inventarioVIP = new InventarioVIP(30);
        System.out.println("Inventario VIP contiene la cantidad de " + inventarioVIP.getCantidad());
        inventarioVIP.agregarProducto("Carolina Herrera 212 Heroes Men EDT", 30);
        inventarioVIP.elimiProducto("Carolina Herrera 212 Heroes Men EDT");
        inventarioVIP.actualizarStock("Carolina Herrera 212 Heroes Men EDT", 15);
        System.out.println("_____________________________________________________________________");

    }
}
