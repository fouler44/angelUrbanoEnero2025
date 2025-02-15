package com.anahuac.software.creacional.factorymethod;

public class SedanCarBasic extends SedanCar{
    @Override
    public void addDoors() {
        System.out.println("Agregar 2 puertas");
    }

    @Override
    public void paint() {
        System.out.println("Agregar 2 capas de pintura");
    }
}
