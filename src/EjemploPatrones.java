
import ClasesBase.Producto2;
import Clases_Patrones.BankCuenta;
import Clases_Patrones.ConfiguracionSistema;
import Clases_Patrones.GastosBancarios;
import Clases_Patrones.ProductoFactory;
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chris
 */
public class EjemploPatrones {
    public static void main(String[] args) {

        ConfiguracionSistema configuracionSistema = ConfiguracionSistema.getInstance();

        System.out.println(configuracionSistema.getParamBD("user"));
        System.out.println(configuracionSistema.getParamUI("idioma"));

        configuracionSistema.setParamBD("user", "ecommerce_user");
        System.out.println(configuracionSistema.getParamBD("user"));



        Map<String, String> parametrosProductoDigital = new HashMap<>();
        parametrosProductoDigital.put("ID", "1");
        parametrosProductoDigital.put("Nombre", "Membresìa InternetTV");
        parametrosProductoDigital.put("precio", "100");
        Producto2 productoDigital = ProductoFactory.crearProducto("digital", parametrosProductoDigital);

        Map<String, String> parametrosProductoFisico = new HashMap<>();
        parametrosProductoFisico.put("ID", "1");
        parametrosProductoFisico.put("Nombre", "Membresìa InternetTV");
        parametrosProductoFisico.put("precio", "100");
        Producto2 productoFisico= ProductoFactory.crearProducto("fisico", parametrosProductoFisico );

        Map<String, String> parametrosProductoVIP = new HashMap<>();
        parametrosProductoFisico.put("ID", "1");
        parametrosProductoFisico.put("Nombre", "Membresía Golden");
        parametrosProductoFisico.put("precio", "100");
        parametrosProductoFisico.put("bonus", "35%");
        Producto2 productoVIP= ProductoFactory.crearProducto("vip", parametrosProductoFisico );


        System.out.println("Precio Producto Digital " +  productoDigital.calcularPrecio()); //10%
        System.out.println("Precio Producto Fìsico " +   productoFisico.calcularPrecio());  //12%
        System.out.println("Precio Producto VIP " +   productoVIP.calcularPrecio());  //12%

        productoDigital.entrega();
        productoFisico.entrega();
        productoVIP.entrega();
        
        BankCuenta bankAccount = new BankCuenta();
        GastosBancarios bankExpense1 = new GastosBancarios("commission", 0.11d);
        GastosBancarios bankExpense2 = new GastosBancarios("expense", 0.22d);
        GastosBancarios bankExpense3 = new GastosBancarios("compensation", 0.33d);
        
        bankAccount.addObserver(bankExpense1);
        bankAccount.addObserver(bankExpense2);
        bankAccount.addObserver(bankExpense3);

        bankAccount.addAmount(5000d);

        System.out.println(bankExpense1.toString());
        System.out.println(bankExpense2.toString());
        System.out.println(bankExpense3.toString());

    }
}
