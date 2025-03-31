package Main;


import Clase.Angajat;
import Fabrici.FactoryPersonalMedical;
import Fabrici.FactoryPersonalNonMedical;
import Fabrici.TipPersonalMedical;
import Fabrici.TipPersonalNonMedical;

public class Main {
    public static void main(String[] args) {

        FactoryPersonalMedical factoryPersonalMedical = new FactoryPersonalMedical(10.5);
        FactoryPersonalNonMedical factoryPersonalNonMedical = new FactoryPersonalNonMedical(10);

        Angajat medic = factoryPersonalMedical.creareAngajat(TipPersonalMedical.MEDIC, "Medic", 10000);
        factoryPersonalMedical.setSpor(15);

        Angajat asistent = factoryPersonalMedical.creareAngajat(TipPersonalMedical.ASISTENT, "Asistent", 5000);
        factoryPersonalMedical.setSpor(5);


        Angajat secretar = factoryPersonalNonMedical.creareAngajat(TipPersonalNonMedical.SECRETAR, "Secretar", 4000);
        factoryPersonalNonMedical.setVechime(1);

        Angajat portar = factoryPersonalNonMedical.creareAngajat(TipPersonalNonMedical.PORTAR, "Portar", 2000);
        factoryPersonalNonMedical.setVechime(3);

        System.out.println(asistent.toString());
        System.out.println(medic.toString());
        System.out.println(portar.toString());
        System.out.println(secretar.toString());
    }
}