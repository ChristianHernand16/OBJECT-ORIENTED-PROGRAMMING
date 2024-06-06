
import Clases_Encapsulamiento.CuentaBancaria;



public class EjemploEncapsulamiento {

    public static void main(String[] args) {


        CuentaBancaria cuenta = new CuentaBancaria("1234567890", 1000.0);
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        cuenta.depositar(30);
        System.out.println("Saldo después de depositar: " + cuenta.getSaldo());
        cuenta.retirar(20);

        System.out.println("Saldo después de retirar: " + cuenta.getSaldo());



    }
}
