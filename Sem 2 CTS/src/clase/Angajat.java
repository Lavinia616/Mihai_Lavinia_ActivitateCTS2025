package clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte,
                   String[] denumireProiecte, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public Angajat() {
        super();
    }

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return String.format("Angajat: Nume=%s, Prenume=%s, Varsta=%d, Punctaj=%d, NrProiecte=%d, DenumireProiecte=%s, Ocupatie=%s, Salariu=%d",
                getNume(), getPrenume(), getVarsta(), getPunctaj(), getNumarProiecte(), Arrays.toString(getDenumiriProiecte()), ocupatie, salariu);
    }

    @Override
    public int finantare() {
        int sumaFinantare = 10;
        System.out.printf("Angajatul %s %s primește %d Euro/zi în proiect.%n", getNume(), getPrenume(), sumaFinantare);
        return sumaFinantare;
    }
}
