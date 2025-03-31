package Fabrici;

import Clase.Angajat;
import Clase.Portar;
import Clase.Secretar;

public class FactoryPersonalNonMedical implements FactoryPersonal{
    private int vechime;

    public FactoryPersonalNonMedical(int vechime) {
        this.vechime = vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }


    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        return switch((TipPersonalNonMedical)tipPersonal){
            case SECRETAR -> new Secretar(nume, salariu, vechime);
            case PORTAR -> new Portar(nume, salariu, vechime);
            default -> null;
        };
    }
}
