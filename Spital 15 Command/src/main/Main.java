package main;

import clase.Internare;
import clase.Medic;
import clase.Pacient;
import clase.Tratament;
import clase.Operator;

public class Main {
    public static void main(String[] args) {
        Pacient p1 = new Pacient("Radu Vasilescu", 45);
        Medic medic = new Medic();
        Operator operator = new Operator();

        operator.trimiteComanda(new Internare(medic, p1));
        operator.trimiteComanda(new Tratament(medic, p1));

        Pacient p2 = new Pacient("Mihai Pop", 54);

        operator.trimiteComanda(new Internare(medic, p2));
        operator.trimiteComanda(new Tratament(medic, p2));
    }
}