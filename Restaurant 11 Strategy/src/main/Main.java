package main;

import clase.Cash;
import clase.Client;

import clase.Card;

public class Main {
    public static void main(String[] args) {
        Client clientCash = new Client("Bogdan Marin", new Cash());
        Client clientCard = new Client("Irina Popa", new Card());

        clientCash.efectueazaPlata(75.5);
        clientCard.efectueazaPlata(120.0);
    }
}