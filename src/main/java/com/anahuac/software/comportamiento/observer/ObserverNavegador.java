package com.anahuac.software.comportamiento.observer;

public class ObserverNavegador implements Observer {

    private boolean isOn;
    private Subject articulo;

    public ObserverNavegador() {}

    public ObserverNavegador(Article articulo, double targetPrice) {
        this.articulo = articulo;
        this.articulo.agregarObserver(this);
        this.isOn = true;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public void update(double price) {
        if (isOn) {
            System.out.println("[Navegador] Mostrando alerta de precio: " + price);
        }
    }

}