/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesBase;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author chris
 */
public class CarritoCompra {
    
    
  protected  List<Producto> productos;
  
  public  void Carritocompra(){
      this.productos=new  ArrayList<>();
      
  }
  public void agregarProducto(int codigo, String nombre,String descripcion, double precio){
      Producto producto=new Producto(1,"computadora", "lapto" ,2.9, 2, 1.0);
 
      this. productos.add(producto);
      
  }
  public void agregarProducto(int codigo){
      Producto producto=new Producto(1,"computadora", "lapto" ,1, 1, 1);
      this.productos.add(producto);
  }
}
