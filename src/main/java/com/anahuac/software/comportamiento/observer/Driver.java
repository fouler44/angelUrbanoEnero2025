package com.anahuac.software.comportamiento.observer;

public class Driver {

    public static void main(String[] args) {
        Article articulo = new Article(100,500);
        ObserverEmail email = new ObserverEmail(articulo,100);
        ObserverNavegador navegador = new ObserverNavegador(articulo, 100);
        ObserverWhatsApp whatsapp = new ObserverWhatsApp(articulo, 100);

        System.out.println("Cambiando precio a 400...");
        articulo.setPrice(400);

        System.out.println("Cambiando precio a 90...");
        articulo.setPrice(90);

    }

}
