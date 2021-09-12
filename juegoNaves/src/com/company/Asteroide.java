package com.company;

import java.util.Objects;

public class Asteroide extends Objeto {

    private int lesion;

    @Override
    public void irA(int x, int y, char direccion) {
        this.posX = x;
        this.posY = y;
        this.direccion = direccion;
    }

    public Asteroide(int x, int y, char direccion, int lesion) {
        super(x,y,direccion);
        this.lesion = lesion;
    }

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Asteroide asteroide = (Asteroide) o;
        return lesion == asteroide.lesion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lesion);
    }

    @Override
    public String toString() {
        return "Asteroide{" +
                "lesion=" + lesion +
                ", posX=" + posX +
                ", posY=" + posY +
                ", direccion=" + direccion +
                '}';
    }
}