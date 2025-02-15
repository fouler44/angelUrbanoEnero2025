package com.anahuac.software.comportamiento.observer;

public class ObserverWhatsApp implements Observer {
    private boolean isOn;
    private Subject articulo;

    public ObserverWhatsApp() {}

    public ObserverWhatsApp(Article articulo, double targetPrice) {
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
            System.out.println("[WhatsApp] Enviando alerta de precio: " + price);
        }
    }
}