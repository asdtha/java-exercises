package com.company.cuentas;

import com.company.Cliente;
import com.company.GravadorImpuesto;

public class CuentaCorriente extends Cuenta implements GravadorImpuesto,Comparable {

    private Double montoAutorizado;

    public CuentaCorriente(Cliente cliente, Double saldo, Double montoAutorizado) {
        super(cliente, saldo);
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void extraer(Double monto) {
        if (monto <= getSaldo() + montoAutorizado){
            System.out.println("Se retiraron " + monto + "pesos");
            setSaldo(getSaldo() - monto);
            System.out.println("Nuevo saldo de su cuenta corriente: " + getSaldo());
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public Double gravarImpuesto(Double porcentaje) {
        Double montoDescontar = getSaldo() * porcentaje;
        setSaldo(getSaldo() * porcentaje);
        System.out.println("Monto gravado de su saldo de su cuenta corriente: ");
        return montoDescontar;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


}