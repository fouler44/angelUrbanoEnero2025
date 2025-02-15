package com.anahuac.software.creacional.singleton;

import java.util.HashMap;
import java.util.Map;


public class Driver {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();


        Map<String, String> listaAsistencia = new HashMap<>();
        listaAsistencia.put("Francisco Cortes", "Presente");
        listaAsistencia.put("Maria Gonzalez", "Ausente");
        listaAsistencia.put("Luis Guillermo", "Justificado");
        listaAsistencia.put("Angel Urbano", "Presente");
        listaAsistencia.put("Carlos Perez", "Ausente");


        for (Map.Entry<String, String> entry : listaAsistencia.entrySet()) {
            String nombre = entry.getKey();
            String asistencia = entry.getValue();

            switch (asistencia) {
                case "Presente":
                    logger.log("INFO", nombre + " está presente.");
                    break;
                case "Ausente":
                    logger.log("ERROR", nombre + " está ausente.");
                    break;
                case "Justificado":
                    logger.log("WARNING", nombre + " tiene falta justificada.");
                    break;
                default:
                    logger.log("WARNING", "Estado de asistencia desconocido para " + nombre);
            }
        }

    }

}
