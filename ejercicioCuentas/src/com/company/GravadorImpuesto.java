package com.company;

public interface GravadorImpuesto {

    //Los métodos de una interface no tienen cuerpo. No pueden ser privados. Solo agrupan comportamiento
    //Principio de responsabilidad única: tienden a tener una sola responsabilidad

    public Double gravarImpuesto(Double porcentaje);

}