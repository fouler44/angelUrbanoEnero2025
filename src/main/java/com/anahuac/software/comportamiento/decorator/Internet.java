package com.anahuac.software.comportamiento.decorator;

public class Internet extends ServicioDecorator {
    private Servicio servicioTelefonico;
    public Internet(Servicio servicioTelefonico) {
        this.servicioTelefonico = servicioTelefonico;
    }

    @Override
    public String getDescription() {
        return this.servicioTelefonico.getDescription() + ", Internet";
    }

    @Override
    public double cost() {
        return this.servicioTelefonico.cost() + 250;
    }

}
