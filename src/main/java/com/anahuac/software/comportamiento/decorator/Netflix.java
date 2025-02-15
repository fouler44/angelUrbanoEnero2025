package com.anahuac.software.comportamiento.decorator;

public class Netflix extends ServicioDecorator {
    private Servicio servicioTelefonico;
    public Netflix(Servicio servicioTelefonico) {
        this.servicioTelefonico = servicioTelefonico;
    }

    @Override
    public String getDescription() {
        return this.servicioTelefonico.getDescription() + ", Netflix";
    }

    @Override
    public double cost() {
        return this.servicioTelefonico.cost() + 50;
    }

}