package main;


import clase.Departament;
import clase.Sectie;
import clase.StructuraAbs;

public class Main {
    public static void main(String[] args) {
    StructuraAbs d1 = new Departament("departament1", 5);
    StructuraAbs d2 = new Departament("departament2", 10);

    StructuraAbs s1 = new Sectie("Sectie 1", 20);
    StructuraAbs s2 = new Sectie("Sectie 2", 25);
    StructuraAbs s3 = new Sectie("Sectie 3", 15);


    d1.AdaugaNod(s1);
    d2.AdaugaNod(s2);
    d2.AdaugaNod(s3);
    d1.AdaugaNod(d2);

    System.out.println(d1.calculeazaNumarAngajati());
    System.out.println(d2.calculeazaNumarAngajati());
    d1.afiseazaDescriere(" ");


    }
}
