package main;

import clase.Client;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Ana Ionescu", "0722334455", "ana@email.com");

        Rezervare r1 = new Rezervare(5, 4, "19:00", client1);
        Rezervare r2 = new Rezervare(7, 2, "21:00", client1);

        r1.afiseazaRezervare();
        r2.afiseazaRezervare();
    }
}