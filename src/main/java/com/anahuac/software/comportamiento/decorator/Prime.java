package com.anahuac.software.comportamiento.decorator;

public class Prime extends ServicioDecorator {
    private Servicio servicioTelefonico;
    public Prime(Servicio servicioTelefonico) {
        this.servicioTelefonico = servicioTelefonico;
    }

    @Override
    public String getDescription() {
        return this.servicioTelefonico.getDescription() + ", Prime";
    }

    @Override
    public double cost() {
        return this.servicioTelefonico.cost() + 50;
    }

}
