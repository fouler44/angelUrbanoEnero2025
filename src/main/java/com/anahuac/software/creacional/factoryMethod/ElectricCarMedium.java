package com.anahuac.software.creacional.factoryMethod;

public class ElectricCarMedium extends ElectricCar{
    @Override
    public void addDoors() {
        System.out.println("Agregar 4 puertas");
    }

    @Override
    public void paint() {
        System.out.println("Agregar 2 capas de pintura");
    }
}
