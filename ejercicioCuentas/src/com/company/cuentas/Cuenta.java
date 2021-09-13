package com.company.cuentas;
import com.company.Cliente;

public abstract class Cuenta {
    // la cuenta -TIENE UN- cliente de tipo Cliente
    private Cliente cliente;
    private Double saldo;

    //Constructor completo:

    public Cuenta(Cliente cliente, Double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }
    //Constructor sin el saldo como parametro
    public Cuenta(Cliente cliente){
        this.cliente = cliente;
        this.saldo = 0.0; // se lo sacamos de parametros
    }

    //
    public void depositar(Double monto){
        System.out.println("Depositaste " + monto + "pesos");
        saldo += monto;
        System.out.println("Tu nuevo saldo es de: " + saldo);
    }

    //Método extraer abstracto porque se va a implementar diferente en sus hijas: método sin cuerpo,
    // sin implementación porque es abstracto
    public abstract void extraer(Double monto);

    //protegido que solo usará el hijo
    protected Double getSaldo() {
        return saldo;
    }

    //protegido que solo usara el hijo
    protected void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}