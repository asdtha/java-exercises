package com.company;

public class Main {

    public static void main(String[] args) {
        Asteroide asteroide = new Asteroide(1,2,'N',30);
        Nave nave = new Nave(3,4,'S',10.3);

        System.out.println("La posicion inicial del asteroide es: X:" + asteroide.getPosX() + " ,Y:" + asteroide.getPosY() + " ,Direccion: " + asteroide.getDireccion());
        System.out.println("La posicion inicial de la nave es: X:" + nave.getPosX() + " ,Y:" + nave.getPosY() + " ,Direccion: " + nave.getDireccion());

        System.out.println("---------------");

        asteroide.irA(5,6,'O');
        //La nave tiene que cambiar de dirección
        nave.irA(8,9,'E');
        System.out.println("La posicion final del asteroide es: X:" + asteroide.getPosX() + " ,Y:" + asteroide.getPosY() + " ,Direccion: " + asteroide.getDireccion());
        System.out.println("La posicion final de la nave es: X:" + nave.getPosX() + " ,Y:" + nave.getPosY() + " ,Direccion: " + nave.getDireccion());

        System.out.println("---------------");

        //La nave ahora cambia de posición sin afectar su dirección
        nave.irA(10,11,'E');
        System.out.println("La posicion nueva de la nave es: X:" + nave.getPosX() + " ,Y:" + nave.getPosY() + " ,Direccion: " + nave.getDireccion());

    }
}
