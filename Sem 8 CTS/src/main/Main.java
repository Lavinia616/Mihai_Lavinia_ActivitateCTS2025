package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare= new Rezervare();
        rezervare.rezerva("Gigel",5,15);

        IRezervare proxyNumarPersoane= new ProxyNumarPersoane(rezervare);
        proxyNumarPersoane.rezerva("Gigu",5,12);
        IRezervare proxyOra= new ProxyOra(proxyNumarPersoane);
        proxyOra.rezerva("Popescu",6,12);
    }
}
