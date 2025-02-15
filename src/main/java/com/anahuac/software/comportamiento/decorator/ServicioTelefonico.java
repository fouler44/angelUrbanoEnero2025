package com.anahuac.software.comportamiento.decorator;

public class ServicioTelefonico extends Servicio {

    @Override
    public String getDescription() {
        return "Servicio Telefonico";

    }

    @Override
    public double cost() {
        return 200;

    }

}