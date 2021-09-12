package com.company;
import java.util.Objects;

public abstract class Objeto {
    protected int posX;
    protected int posY;
    protected char direccion;

    public Objeto() {
        super();
    }

    public Objeto(int posX, int posY, char direccion) {
        this.posX = posX;
        this.posY = posY;
        this.direccion = direccion;
    }

    public abstract void irA(int x, int y, char direccion);

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objeto objeto = (Objeto) o;
        return posX == objeto.posX && posY == objeto.posY && Objects.equals(direccion, objeto.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posX, posY, direccion);
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", direccion=" + direccion +
                '}';
    }
}
