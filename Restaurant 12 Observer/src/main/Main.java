package main;

import clase.Client;
import clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Client c1 = new Client("Elena Georgescu");
        Client c2 = new Client("Mihai Tanase");

        restaurant.aboneaza(c1);
        restaurant.aboneaza(c2);

        restaurant.trimiteOferta("Oferta speciala: DESERT 1+1 GRATIS");
    }
}