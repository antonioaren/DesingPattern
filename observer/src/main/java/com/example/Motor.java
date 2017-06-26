package com.example;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Pedro Arenas on 26/6/17.
 */

public class Motor implements Observador {

    public Motor() {

    }

    @Override
    public void update() {
        System.out.println("Subir la velocidad");

    }
}
