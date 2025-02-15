package com.anahuac.software.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Article implements Subject {

    private List<Observer> observers;
    private double price;
    private double targetPrice;

    public Article(double targetPrice, double price) {
        this.targetPrice = targetPrice;
        this.price = price;
        observers = new ArrayList<>();
    }

    @Override
    public void agregarObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        if (price <= targetPrice) {
            notifyObserver();
        }
    }

    public double getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(double targetPrice) {
        this.targetPrice = targetPrice;
    }
}