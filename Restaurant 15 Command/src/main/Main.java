package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Masa masa5 = new Masa(5);
        Masa masa8 = new Masa(8);

        Command rezerva = new Rezervare(masa5);
        Command ocupa = new Ocupare(masa8);

        Operator operator = new Operator();

        operator.trimiteComanda(rezerva);
        operator.trimiteComanda(ocupa);
    }
}