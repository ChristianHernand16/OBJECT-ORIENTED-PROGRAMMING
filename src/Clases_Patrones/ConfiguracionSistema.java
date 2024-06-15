/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Patrones;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chris
 */
public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;
    private Map<String, String> parametrosConexionBD;
    private Map<String, String> configuracionesUI;

    private ConfiguracionSistema() {

        parametrosConexionBD = new HashMap<>();
        parametrosConexionBD.put("host", "localhost");
        parametrosConexionBD.put("database", "compras");
        parametrosConexionBD.put("user", "cristian");
        parametrosConexionBD.put("password", "cuenca");

        configuracionesUI = new HashMap<>();
        configuracionesUI.put("tema", "oscuro");
        configuracionesUI.put("idioma", "Espaniol");
    }

    public static ConfiguracionSistema getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    public Map<String, String> getParametrosConexionBD() {
        return parametrosConexionBD;
    }

    public Map<String, String> ConfiguracionesUI() {
        return configuracionesUI;
    }

    public String getParamBD(String nombreParametro) {
        if (parametrosConexionBD.containsKey(nombreParametro)) {
            return parametrosConexionBD.get(nombreParametro);
        } else {
            return "";
        }
    }

    public void setParamBD(String nombreParametro, String valor) {
        if (parametrosConexionBD.containsKey(nombreParametro)) {
            parametrosConexionBD.replace(nombreParametro, valor);
        }
    }

    public String getParamUI(String nombreParametro) {
        if (configuracionesUI.containsKey(nombreParametro)) {
            return configuracionesUI.get(nombreParametro);
        } else {
            return "";
        }
    }
}