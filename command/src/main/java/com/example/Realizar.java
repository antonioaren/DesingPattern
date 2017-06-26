/**
 * Este ejemploSW3 es el que contiene la clase Realizar.java
 */
package com.example;

import java.util.Scanner;

/**
 * @author Julio Cesar Garcia Sabogal
 * @author Ingenieria en sistemas y computacion
 * @author Uniquindio
 */

public class Realizar {
    public static void main(String[] args) {

        Cerebro cerebro = new Cerebro();

        Command comer = new Comer(cerebro);
        Command dormir = new Dormir(cerebro);
        Command estudiar = new Estudiar(cerebro);

        Persona persona = new Persona(comer, estudiar, dormir);

        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String line = s.nextLine();
            if (line.equalsIgnoreCase("suicidese")) {
                System.out.println("La Persona ha muerto");
                break;
            }
            if (line.equalsIgnoreCase("vaya coma")) {
                persona.comer();
                continue;
            }
            if (line.equalsIgnoreCase("vaya estudie")) {
                persona.estudiar();
                continue;
            }
            if (line.equalsIgnoreCase("vaya duerma")) {
                persona.dormir();
                continue;
            }
            System.out.println("No entiendo lo que me dice");
        }
    }
}
