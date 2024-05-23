package Clases_EjPolimorfismo;



import ClasesBase.Producto;
import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    protected List<Producto> listaProductos;

    public CarritoCompras() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(int id,String nombre,String descripcion,double precio,double tasaIVA,int stock){
        Producto producto = new Producto(id, nombre, descripcion, precio, stock, tasaIVA);
        this.listaProductos.add(producto);
    }
    public void agregarProducto(int ID,String nombre,String descripcion){
        Producto producto = new Producto(ID, nombre, descripcion, ID, ID, ID);
        this.listaProductos.add(producto);
    }
    public void agregarProducto(int ID,String Nombre){
        Producto producto = new Producto(ID, Nombre, Nombre, ID, ID, ID);
        this.listaProductos.add(producto);
    }

}
