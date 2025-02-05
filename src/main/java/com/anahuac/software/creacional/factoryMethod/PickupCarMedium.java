package com.anahuac.software.creacional.factoryMethod;

public class PickupCarMedium extends PickupCar{

    @Override
    public void addDoors() {
        System.out.println("Agregar 2 puertas gama media");
    }

    @Override
    public void paint() {
        System.out.println("Agregar 3 capas de pintura");
    }
}
