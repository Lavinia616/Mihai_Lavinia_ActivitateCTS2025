package main;

import clase.Internare;
import clase.Pacient;
import clase.Template;

public class Main {
    public static void main(String[] args) {

            Pacient pacient = new Pacient("Maria Ionescu", 52);
            Template internare = new Internare(pacient);
            internare.interneazaPacient();
    }
}