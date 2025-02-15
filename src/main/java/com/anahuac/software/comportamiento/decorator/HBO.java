package com.anahuac.software.comportamiento.decorator;

public class HBO extends ServicioDecorator {
    private Servicio servicioTelefonico;
    public HBO(Servicio servicioTelefonico) {
        this.servicioTelefonico = servicioTelefonico;
    }

    @Override
    public String getDescription() {
        return this.servicioTelefonico.getDescription() + ", HBO";
    }

    @Override
    public double cost() {
        return this.servicioTelefonico.cost() + 100;
    }
}
