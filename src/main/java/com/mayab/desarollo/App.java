package com.mayab.desarollo;

import com.anahuac.software.creacional.singleton.Logger;

public class App 
{
    public static void main( String[] args )
    {
        Logger logger = Logger.getInstance();

        System.out.println("logger = " + logger);
    }
}
