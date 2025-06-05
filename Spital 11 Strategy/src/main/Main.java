package main;

import clase.Card;
import clase.Cash;
import clase.Pacient;

public class Main {
    public static void main(String[] args) {

        Pacient pacient =new Pacient("Ionescu");
        pacient.setMetodaPlata(new Card());
        pacient.efectueazaPlata(300);

        pacient.setMetodaPlata(new Cash());
        pacient.efectueazaPlata(100);

        Pacient p2=new Pacient("Popescu");
        p2.efectueazaPlata(200);

    }
}