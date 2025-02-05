package com.anahuac.software.creacional.factoryMethod;

public class Driver {
    public static void main(String[] args) {
        CarFactory fabricaElectrica = new ElectricFactory();
        CarFactory fabriicaPickup = new PickupFactory();

        fabricaElectrica.ensamblar("basic");
        fabricaElectrica.ensamblar("medium");
        fabricaElectrica.ensamblar("high");

        System.out.println("Pickup -------------------------------------------------------");
        fabriicaPickup.ensamblar("basic");
        fabriicaPickup.ensamblar("medium");
        fabriicaPickup.ensamblar("high");
    }
}
