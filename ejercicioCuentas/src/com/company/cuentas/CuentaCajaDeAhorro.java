package com.company.cuentas;

import com.company.Cliente;

public class CuentaCajaDeAhorro extends Cuenta {

    //No debo escribir los atributos cliente y saldo porque lo hereda de Cuenta
    private Double tasaDeInteres;

    //Constructor
    public CuentaCajaDeAhorro(Cliente cliente, Double saldo, Double tasaDeInteres){
        super(cliente, saldo);
        this.tasaDeInteres = tasaDeInteres;
    }

    //No tengo que sobreescribir el método depositar en esta clase porque lo hace igual que el padre


    //Sí tengo que sobreescribir el metodo extraer porque es abstracto(sin implementación en la clase abstracta),
    //lo que significa que cada una de sus clases hijas lo implementará de modo diferente
    @Override
    public void extraer(Double monto) {
        // uso el getSaldo protegido de la clase abstracta así evito poner protegido el atributo saldo en la clase padre
        if(getSaldo() >= monto){
            System.out.println("se retiraron " + monto + "pesos de tu cuenta de ahorro");
            setSaldo(getSaldo() - monto);
            System.out.println("Nuevo saldo de su cuenta de ahorro: " + getSaldo());
        }else {
            System.out.println("saldo insuficiente");
        }
    }

    // Un modo de hacerlo sería:
    public void cobrarIntereses(){
        System.out.println("Cobraste interés de tu cuenta de ahorro");
        setSaldo(getSaldo() + getSaldo() * tasaDeInteres);
        System.out.println("Nuevo saldo más interés: " + getSaldo());

    }

    //Otro modo sería
    //public void cobrarIntereses(){
    //    depositar(getSaldo()*tasaDeInteres);
    // }

}
