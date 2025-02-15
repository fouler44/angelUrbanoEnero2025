package com.anahuac.software.creacional.singleton;

public class Logger {

    private static Logger instance;

    private Logger() {  }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String severity, String message){
        System.out.println(severity + ": " + message);
    }

}
