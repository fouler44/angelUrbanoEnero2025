package com.anahuac.software.creacional.factoryMethod;

public class SedanCarHigh extends SedanCar{
    @Override
    public void addDoors() {
        System.out.println("Agregar 4 puertas gama alta");
    }

    @Override
    public void paint() {
        System.out.println("Agregar 3 capas de pintura de alta calidad");
    }
}
