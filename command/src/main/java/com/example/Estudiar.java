/**
 * Este ejemploSW3 es el que contiene la clase Estudiar.java
 */
package com.example;

/**
 * @author Julio Cesar Garcia Sabogal
 * @author Ingenieria en sistemas y computacion
 * @author Uniquindio
 *         <p>
 *         Comando espec�fico
 */
public class Estudiar implements Command {

    Cerebro miCerebro;

    /**
     * Metodo que permite inicializar los elementos de la clase Estudiar.java
     */
    public Estudiar(Cerebro cerebro) {
        this.miCerebro = cerebro;
    }

    /* (non-Javadoc)
     * @see ejemploSW3.Command#execute()
     */
    @Override
    public void execute() {
        miCerebro.estudiar();
    }

}
