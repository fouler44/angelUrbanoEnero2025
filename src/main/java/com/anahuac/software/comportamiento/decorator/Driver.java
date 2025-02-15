package com.anahuac.software.comportamiento.decorator;

public class Driver {

    public static void main(String[] args) {
        Servicio servicio = new ServicioTelefonico();
        System.out.println(servicio.getDescription());
        System.out.println(servicio.cost());

        Servicio serviciosExtra = new ServicioTelefonico();
        serviciosExtra = new Internet(serviciosExtra);
        serviciosExtra = new HBO(serviciosExtra);
        serviciosExtra = new Disney(serviciosExtra);
        serviciosExtra = new Prime(serviciosExtra);
        serviciosExtra = new Netflix(serviciosExtra);
        System.out.println(serviciosExtra.getDescription());
        System.out.println(serviciosExtra.cost());


    }

}