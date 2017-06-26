/**
 * Este ejemploSW3 es el que contiene la clase Comer.java
 */
package com.example;

/**
 * @author Julio Cesar Garcia Sabogal
 * @author Ingenieria en sistemas y computacion
 * @author Uniquindio
 *         <p>
 *         Comando espec�fico
 */
public class Comer implements Command {

    private Cerebro miCerebro;

    /**
     * Metodo que permite inicializar los elementos de la clase Comer.java
     */

    public Comer(Cerebro cerebro) {
        this.miCerebro = cerebro;
    }


    @Override
    public void execute() {
        miCerebro.comer();
    }

}
