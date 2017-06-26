package com.example;

/**
 * Created by Pedro Arenas on 26/6/17.
 */

public class Logger {

    private static Logger log;

    public Logger() {
    }

    //Declaración del getInstance. Lo crea si no ha sido creado.
    public static synchronized Logger getInstance() {
        if (log == null) {
            log = new Logger();
        }
        return log;
    }

    //Aquí irian los métodos que llamariamos a través del getInstance()
    public void log(String msg) {
        System.out.println(msg);
    }
}
