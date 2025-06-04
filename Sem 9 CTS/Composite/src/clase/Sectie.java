package clase;

public class Sectie extends StructuraAbs{
    public Sectie(String nume, int numarAngajati) {
        super(nume, numarAngajati);
    }

    @Override
    public void stergereNod(StructuraAbs structuraAbs) {
        System.out.println("Nu este implementat!");
    }

    @Override
    public void AdaugaNod(StructuraAbs structuraAbs) {
        System.out.println("Nu exista noduri copil!");
    }

    @Override
    public StructuraAbs getNodCopil(int index) {
        return this;
    }

    @Override
    public void afiseazaDescriere(String tab) {
        System.out.println(tab + "Sectia " +this.getNume());
    }

    @Override
    public int calculeazaNumarAngajati() {
        return this.getNumarAngajati();
    }
}
