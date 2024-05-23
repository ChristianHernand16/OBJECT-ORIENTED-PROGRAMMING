/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

/**
 *
 * @author chris
 */
package Clases_EjAbstraccion;

import Clases_Abstractas.SistemaPago;

public class PagoTarjetaCredito extends SistemaPago {

    @Override
    public void iniciarPago() {
        System.out.println("Iniciando Pago por medio de Tarjetas  Crédito");
    }

    @Override
    public void verificarPago() {
        System.out.println("Pago realizado Correctamete por medio de Tarjetas de Crédito");
    }

    @Override
    public void confirmarPago() {
        System.out.println("Pago confirmado Correctamete por medio de Tarjetas de Crédito");
    }
}
