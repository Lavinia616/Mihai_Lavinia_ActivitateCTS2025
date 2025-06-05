package main;

import clase.Produs;
import clase.SectiuneMeniu;

public class Main {
    public static void main(String[] args) {
        SectiuneMeniu meniu = new SectiuneMeniu("MENIU COMPLET");

        SectiuneMeniu bauturi = new SectiuneMeniu("Bauturi");
        SectiuneMeniu sucuri = new SectiuneMeniu("Sucuri naturale");
        sucuri.adauga(new Produs("Portocale"));
        sucuri.adauga(new Produs("Mar"));
        bauturi.adauga(sucuri);
        bauturi.adauga(new Produs("Cafea"));

        SectiuneMeniu desert = new SectiuneMeniu("Desert");
        desert.adauga(new Produs("Papanasi"));
        desert.adauga(new Produs("Cheesecake"));

        meniu.adauga(bauturi);
        meniu.adauga(desert);

        meniu.afiseaza("");
    }
}