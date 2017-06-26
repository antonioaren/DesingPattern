package com.example;

public class main {

    public static void main(String[] arg) {
        ObservableDemo observable = new ObservableDemo();
        ObserverExample observer = new ObserverExample();

        observable.addObserver(observer);
        observable.setWeather("Bright and sunny...Let's play cricket!!");
    }
}
