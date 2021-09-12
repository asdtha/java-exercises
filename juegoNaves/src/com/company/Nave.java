package com.company;


import java.util.Objects;

public class Nave extends Objeto {

    private Double velocidad;
    private int vida;

    public Nave(int x, int y, char direccion, Double velocidad) {
        super(x,y,direccion);
        this.velocidad = velocidad;
    }

    @Override
    public void irA(int x, int y,char direccion) {
        if(direccion != this.getDireccion()) {
            System.out.println("La nave tiene que cambiar su direccion de " + this.direccion + " a " + direccion);
            this.girar(direccion);
        }
        this.posX = x;
        this.posY = y;
    }

    public void girar(char direccion) {
        this.direccion = direccion;
    }

    public void restaVida(int valor) {
        this.vida -= valor;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Nave nave = (Nave) o;
        return vida == nave.vida && Objects.equals(velocidad, nave.velocidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), velocidad, vida);
    }

    @Override
    public String toString() {
        return "Nave{" +
                "velocidad=" + velocidad +
                ", vida=" + vida +
                ", posX=" + posX +
                ", posY=" + posY +
                ", direccion=" + direccion +
                '}';
    }
}