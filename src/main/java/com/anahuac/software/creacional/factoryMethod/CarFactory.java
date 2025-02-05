package com.anahuac.software.creacional.factoryMethod;

public abstract class CarFactory {

    private Car auto;

    public abstract Car createCar(String type);

    public void ensamblar(String type){
        auto = createCar(type);
        auto.addBody();
        auto.addDoors();
        auto.paint();
    }
}
