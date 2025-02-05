package com.anahuac.software.creacional.factoryMethod;

public class PickupFactory extends CarFactory{

    @Override
    public Car createCar(String type) {
        Car pickup = null;
        switch (type){
            case "basic": pickup = new PickupCarBasic(); break;
            case "medium": pickup = new PickupCarMedium(); break;
            case "high": pickup = new PickupCarHigh(); break;
        }
        return pickup;
    }
}
