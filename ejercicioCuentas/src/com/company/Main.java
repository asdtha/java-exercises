package com.company;

import com.company.cuentas.CuentaCajaDeAhorro;
import com.company.cuentas.CuentaComitente;
import com.company.cuentas.CuentaCorriente;

//Probamos nuestras clases y métodos
public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(123, 1234, 1,"Lopez");

        //Instanciamos nuestras distintas clases de cuenta
        CuentaCajaDeAhorro cuentaAhorro = new CuentaCajaDeAhorro(cliente, 500.0, 0.1);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(cliente,100.0,1000.0);
        CuentaComitente cuentaComitente = new CuentaComitente(cliente, 900.0, "Holis");

        //Probamos método depositar en las tres clases de cuenta
        System.out.println("***Depósitos***");
        cuentaAhorro.depositar(500.0);
        cuentaCorriente.depositar(900.0);
        cuentaComitente.depositar(100.0);

        //Método extraer
        System.out.println();
        System.out.println("***Extracciones***");
        cuentaAhorro.extraer(100.0);
        cuentaCorriente.extraer(100.0);
        cuentaComitente.extraer(500.0);

        //Método extraer sobrecargado
        System.out.println();
        cuentaComitente.extraer(500.0,"Holis");

        //  Cobrar intereses cuenta de ahorro
        System.out.println();
        System.out.println("***Cobro de interés CA***");
        cuentaAhorro.cobrarIntereses();

        // Gravar impuesto cuenta corriente
        System.out.println();
        System.out.println("***Gravando impuestos Cuenta Corriente***");
        System.out.println(cuentaCorriente.gravarImpuesto(0.5));
    }
}
