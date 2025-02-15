package com.anahuac.software.comportamiento.decorator;

public class Disney extends ServicioDecorator {
    private Servicio servicioTelefonico;
    public Disney(Servicio servicioTelefonico) {
        this.servicioTelefonico = servicioTelefonico;
    }

    @Override
    public String getDescription() {
        return this.servicioTelefonico.getDescription() + ", Disney";
    }

    @Override
    public double cost() {
        return this.servicioTelefonico.cost() + 100;
    }

}