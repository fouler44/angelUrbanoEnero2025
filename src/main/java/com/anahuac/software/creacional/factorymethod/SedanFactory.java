package com.anahuac.software.creacional.factorymethod;

public class SedanFactory extends CarFactory{

    @Override
    public Car createCar(String type) {
        Car carro = null;
        switch (type) {
            case "basic": carro = new SedanCarBasic(); break;
            case "medium": carro = new SedanCarMedium(); break;
            case "high": carro = new SedanCarHigh(); break;
        }
        return carro;
    }
}
