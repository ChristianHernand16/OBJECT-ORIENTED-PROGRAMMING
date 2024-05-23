/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ClasesBase;

/**
 *
 * @author chris
 */
public class Ecommerce {

    public static void main(String[] args) {
        System.out.println("Comercio!");

        Cliente cli = new Cliente("juan", "perez", "0106393291", "cuenca", "0993648198", "christianh1996@hotmai.com");

        System.out.println("nombre " + cli.getNombre() + " apellido " + cli.getApellido() + " cedula " + cli.getCedula() + " direccion " + cli.getDireccion() + " celular " + cli.getCelular() + " Email " + cli.getEmail());

        
        System.out.println("******************************************************************************************************************* ");
        
        //Factura fac1 = new Factura(1, 2, 12.7, 12.7, 12, 12.0, "Chistian", "Hernandez", "0106393291", "cuenca", "0993648198", "christianh1996@hotmai.com");

        //System.out.println("Numero Factura " + fac1.getNumero_factura() + " Cantidad " + fac1.getCantidad() + " precio " + fac1.getPrecio() + " subtotal " + fac1.getSubtotal() + " iva% " + fac1.getIva() + " total " + fac1.getTotal() + " Cliente 2 " + "nombre " + fac1.getNombre() + " apellido " + fac1.getApellido() + " cedula " + fac1.getCedula() + " direccion " + fac1.getDireccion() + " celular " + fac1.getCelular() + " Email " + fac1.getEmail());

       

    }

}
