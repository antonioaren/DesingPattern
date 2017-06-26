package com.example;

import java.util.ArrayList;

/**
 * Created by Pedro Arenas on 26/6/17.
 */

public class Acelerador implements Observable {

    private ArrayList<Observador> observers;

    public Acelerador() {
        observers = new ArrayList<>();
    }

    public void ApretarAcelerador() {
        notificar();
    }

    public void LinkObservers(Observador o) {
        observers.add(o);
    }


    @Override
    public void notificar() {
        for (Observador o : observers) {
            o.update();
        }
    }
}
