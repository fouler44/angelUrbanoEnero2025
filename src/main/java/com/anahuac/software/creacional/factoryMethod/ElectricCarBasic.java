package com.anahuac.software.creacional.factoryMethod;

public class ElectricCarBasic extends ElectricCar{

    public void addDoors() {
        System.out.println("Agregar 2 puertas");
    }

    @Override
    public void paint() {
        System.out.println("Agregar 2 capas de pintura");
    }
}
