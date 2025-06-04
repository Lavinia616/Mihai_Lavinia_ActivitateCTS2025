package main;

import clase.Autobuz;
import clase.Calator;
import clase.Observabil;
import clase.Observator;

public class Main {
    public static void main(String[] args) {
        Autobuz a1= new Autobuz(100);
        Observator c1= new Calator("andrei");

        a1.abonareObservator(c1);
        a1.pleacaDeLaCapat();
    }
}
