package main;

import clase.Libera;
import clase.Masa;
import clase.Ocupata;
import clase.Rezervata;

public class Main {
    public static void main(String[] args) {
        Masa m = new Masa(10);

        m.afiseazaStare();

        m.setStare(new Rezervata());
        m.afiseazaStare();

        m.setStare(new Ocupata());
        m.afiseazaStare();

        m.setStare(new Libera());
        m.afiseazaStare();
    }
}