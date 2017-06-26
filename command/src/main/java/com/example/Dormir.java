/**
 * Este ejemploSW3 es el que contiene la clase Dormir.java
 */
package com.example;

/**
 * @author Julio Cesar Garcia Sabogal
 * @author Ingenieria en sistemas y computacion
 * @author Uniquindio
 *         <p>
 *         Comando espec�fico
 */
public class Dormir implements Command {

    Cerebro miCerebro;

    /**
     * Metodo que permite inicializar los elementos de la clase Dormir.java
     */
    public Dormir(Cerebro cerebro) {
        this.miCerebro = cerebro;
    }


    @Override
    public void execute() {
        miCerebro.dormir();
    }

}
