package com.company;

public class Cliente {
    private Integer dni;
    private Integer cuit;
    private Integer numeroCliente;
    private String apellido;

    public Cliente(Integer dni, Integer cuit, Integer numeroCliente, String apellido) {
        this.dni = dni;
        this.cuit = cuit;
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
    }
}