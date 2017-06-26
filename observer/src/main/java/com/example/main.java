package com.example;

public class main {

    public static void main(String[] arg) {
        //A acelerador -----> B motor
        //Motor es observador
        //Acelerador Observable (Observable o sujeto)

        Motor v8 = new Motor();
        Acelerador pedal = new Acelerador();

        //Se puede enlazar porque motor() implementa Observador
        pedal.LinkObservers(v8);
        pedal.ApretarAcelerador();
    }
}
