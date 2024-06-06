/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Patrones;


import ClasesBase.Producto2;
import Clases_EjPolimorfismo.ProductoDigital;
import Clases_EjPolimorfismo.ProductoFisico;
import Clases_EjPolimorfismo.ProductoVip;
import java.util.Map;

/**
 *
 * @author chris
 */
public class ProductoFactory {
       public static Producto2 crearProducto( String tipoProducto, Map<String, String> parametros) {
        if (tipoProducto.equalsIgnoreCase("digital")) {
            return new ProductoDigital(
                    Integer.parseInt(parametros.get("ID")),
                    parametros.get("Nombre"),
                    Double.parseDouble(parametros.get("precio")));

        } else if (tipoProducto.equalsIgnoreCase("fisico")) {
            return new ProductoFisico(
                    Integer.parseInt(parametros.get("ID")),
                    parametros.get("Nombre"),
                    Double.parseDouble(parametros.get("precio")));

        } else if (tipoProducto.equalsIgnoreCase("vip")) {
            return new ProductoVip(
                    Integer.parseInt(parametros.get("ID")),
                    parametros.get("Nombre"),
                    Double.parseDouble(parametros.get("precio")),
                    parametros.get("bonus"));
        } else {
            throw new IllegalArgumentException("Tipo de producto no válido: " + tipoProducto);
        }
    }
}
