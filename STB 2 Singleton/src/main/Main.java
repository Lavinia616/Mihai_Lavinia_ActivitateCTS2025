package main;

import clase.MijlocTransport;
import clase.TipTransport;
import clase.TransportFactory;

public class Main {
    public static void main(String[] args) {
        MijlocTransport t1 = TransportFactory.creare(TipTransport.TRAMVAI);
        t1.afiseaza();

        MijlocTransport t2 = TransportFactory.creare(TipTransport.AUTOBUZ);
        t2.afiseaza();
    }
}