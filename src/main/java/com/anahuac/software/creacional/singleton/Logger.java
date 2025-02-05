package com.anahuac.software.creacional.singleton;

public class Logger {

    private static Logger logger;

    private Logger() {
        System.out.println("Creating logger");
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

}
