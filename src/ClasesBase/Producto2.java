/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesBase;

/**
 *
 * @author chris
 */
public class Producto2 {
       public int ID;
    public String Nombre;
    public double precio;

    public Producto2(Producto2 producto) {
        this.ID = producto.ID;
        Nombre = producto.Nombre;
        this.precio = producto.precio;
    }

    public Producto2(int ID, String nombre, double precio) {
        this.ID = ID;
        Nombre = nombre;
        this.precio = precio;
    }

    public Producto2(int ID) {
        this.ID = ID;
        Nombre = "Producto Sin Nombre";
        this.precio = 0.00;
    }

    public Producto2(int ID, String nombre) {
        this.ID = ID;
        Nombre = nombre;
        this.precio = 0.00;
    }

    public void entrega(){
        System.out.println("Entrega  de Producto Genèrico");
    }

    public double calcularPrecio(){
        return 0;
    }
}

