package com.example;

import java.util.Observable;

/**
 * Created by Pedro Arenas on 26/6/17.
 */

public class ObservableDemo extends Observable {

    private String weather;

    public ObservableDemo() {
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
        setChanged();
        notifyObservers();
    }
}
