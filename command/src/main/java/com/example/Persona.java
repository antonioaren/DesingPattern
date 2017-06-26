/**
 * Este ejemploSW3 es el que contiene la clase Persona.java
 */
package com.example;

/**
 * @author Julio Cesar Garcia Sabogal
 * @author Ingenieria en sistemas y computacion
 * @author Uniquindio
 *         <p>
 *         Invocador
 */
public class Persona {


    private Command ordenComer, ordenEstudiar, ordenDormir;

    public Persona(Command cmdComer, Command cmdEstudiar, Command cmdDormir) {
        this.ordenComer = cmdComer;
        this.ordenDormir = cmdDormir;
        this.ordenEstudiar = cmdEstudiar;
    }

    public void comer() {
        ordenComer.execute();
    }

    public void dormir() {
        ordenDormir.execute();
    }

    public void estudiar() {
        ordenEstudiar.execute();
    }
}
