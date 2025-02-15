package com.anahuac.software.comportamiento.observer;

public interface Subject {
    public void agregarObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();

}
