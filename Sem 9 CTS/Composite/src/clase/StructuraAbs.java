package clase;

public abstract class StructuraAbs {
    private String nume;
    private int numarAngajati;

    public StructuraAbs(String nume, int numeAngajati) {
        this.nume = nume;
        this.numarAngajati = numeAngajati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumeAngajati(int numeAngajati) {
        this.numarAngajati = numeAngajati;
    }

 public abstract void stergereNod(StructuraAbs structuraAbs);

 public abstract void AdaugaNod(StructuraAbs structuraAbs);

 public abstract StructuraAbs getNodCopil(int index);

    public abstract void afiseazaDescriere(String tab);

    public abstract int calculeazaNumarAngajati();


}
