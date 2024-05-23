/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

/**
 *
 * @author chris
 */
package Clases_EjAbstraccion;


import Clases_Abstractas.SistemaPago;

public class PagoTransferenciaBancaria extends SistemaPago {
    
       @Override
    public void iniciarPago() {
        System.out.println("Iniciando Pago por medio de Transferencia Bancaria ");
    }

    @Override
    public void verificarPago() {
        System.out.println("Pago realizado Correctamete por medio de Transferencia Bancaria");
    }

    @Override
    public void confirmarPago() {
        System.out.println("Pago confirmado Correctamete por medio de Transferencia Bancaria");
    }
}
