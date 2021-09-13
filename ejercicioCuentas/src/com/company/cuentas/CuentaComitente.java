package com.company.cuentas;

import com.company.Cliente;

public class CuentaComitente extends Cuenta {
    private String claveValidacion;

    public CuentaComitente(Cliente cliente, Double saldo, String claveValidacion) {
        super(cliente, saldo);
        this.claveValidacion = claveValidacion;
    }

    @Override
    public void depositar (Double monto) {
        Double montoDepositado = monto * 0.99;
        setSaldo(getSaldo() + montoDepositado);
        System.out.println("Se depositaron " + montoDepositado + " pesos");
        System.out.println("Tu nuevo saldo es de " + getSaldo());
    }

    @Override // Sobreescribo el método: lo implemento dejando la firma igual
    public void extraer(Double monto) {
        if (monto <= getSaldo() *0.5){
            System.out.println("Con este método puede retirar hasta el 50% de su saldo");
            setSaldo(getSaldo() - monto);
            System.out.println("nuevo saldo de su cuenta comitente: " + getSaldo());
        }else{
            System.out.println("Límite de extracción excedido de tu cuenta comitente. Solo puede retirar hasta el 50% de su saldo. Ingrese clave para disponer de la totalidad");
        }
    }

    // Sobrecargo el método: cambio la firma del método al agregarle otro parámetro
    public void extraer(Double monto, String clave) {
        if (clave.equals(this.claveValidacion)) {
            if (monto <= getSaldo()) {
                System.out.println("¡Clave correcta! El monto a retirar es: " + monto);
                setSaldo(getSaldo() - monto);
                System.out.println("Su nuevo saldo de su cuenta comitente es: " + getSaldo());
            } else {
                System.out.println("Su saldo es insuficiente");
            }
        }else {
            System.out.println("Clave incorrecta, inténtalo de nuevo");
        }

    }
}