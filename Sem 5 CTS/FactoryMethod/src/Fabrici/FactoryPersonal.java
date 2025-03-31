package Fabrici;

import Clase.Angajat;

public interface FactoryPersonal {
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu);
}
