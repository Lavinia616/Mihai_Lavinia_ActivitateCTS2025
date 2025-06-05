package main;

import clase.Externat;
import clase.Pacient;
import clase.SubObservatie;

public class Main {
    public static void main(String[] args) {

        Pacient pacient = new Pacient("Ion", 20);
        pacient.afiseazaStare();

        pacient.setStare(new SubObservatie());
        pacient.afiseazaStare();

        pacient.setStare(new Externat());
        pacient.afiseazaStare();
    }
}