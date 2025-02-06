package com.anahuac.software.creacional.factoryMethod;

public class Driver {
    public static void main(String[] args) {
        CarFactory fabricaElectrica = new ElectricFactory();
        CarFactory fabricaPickup = new PickupFactory();
        CarFactory fabricaSedan = new SedanFactory();

        System.out.println("Electric -------------------------------------------------------");
        System.out.println("Electric Basic: ");
        fabricaElectrica.ensamblar("basic");
        System.out.println("\nElectric Medium: ");
        fabricaElectrica.ensamblar("medium");
        System.out.println("\nElectric High: ");
        fabricaElectrica.ensamblar("high");

        System.out.println("\nPickup -------------------------------------------------------");
        System.out.println("Pickup Basic: ");
        fabricaPickup.ensamblar("basic");
        System.out.println("\nPickup Medium: ");
        fabricaPickup.ensamblar("medium");
        System.out.println("\nPickup High: ");
        fabricaPickup.ensamblar("high");

        System.out.println("\nSedán -------------------------------------------------------");
        System.out.println("Sedan Basic: ");
        fabricaSedan.ensamblar("basic");
        System.out.println("\nSedan Medium: ");
        fabricaSedan.ensamblar("medium");
        System.out.println("\nSedan High: ");
        fabricaSedan.ensamblar("high");
    }
}
