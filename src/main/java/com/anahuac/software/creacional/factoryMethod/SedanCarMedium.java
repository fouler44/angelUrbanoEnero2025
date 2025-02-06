package com.anahuac.software.creacional.factoryMethod;

public class SedanCarMedium extends SedanCar{

    @Override
    public void addDoors() {
        System.out.println("Agregar 4 puertas");
    }

    @Override
    public void paint() {
        System.out.println("Agregar 3 capas de pintura");
    }
}
