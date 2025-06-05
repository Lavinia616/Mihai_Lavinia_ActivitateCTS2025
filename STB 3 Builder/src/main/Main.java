package main;

import clase.AutobuzLinie;
import clase.Builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder("Mercedes", "Ion Popescu");
        AutobuzLinie autobuz = builder
                .setOpriri(false)
                .setAutoUsi(false)
                .setAfisaj("312 Piata Unirii")
                .build();

        autobuz.afiseazaDetalii();
    }
}