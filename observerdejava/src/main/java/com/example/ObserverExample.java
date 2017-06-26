package com.example;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Pedro Arenas on 26/6/17.
 */

public class ObserverExample implements Observer {
    //Este es observador: Cuando ocurra la notificación este ejecutará el códido.
    //En el observador (Observer) se crea un observado(Observable).

    private ObservableDemo weatherUpdate;

    @Override
    public void update(Observable observable, Object o) {
        weatherUpdate = (ObservableDemo) observable;
        System.out.println("Weather Report Live. Its " + weatherUpdate.getWeather());
    }
}
