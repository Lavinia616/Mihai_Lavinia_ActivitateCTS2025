package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbs{
    private List<StructuraAbs> structuriList;

    public Departament(String nume, int numarAngajati) {
        super(nume, numarAngajati);
        structuriList=new ArrayList<>();
    }

    @Override
    public void stergereNod(StructuraAbs structuraAbs) {
        structuriList.remove(structuraAbs);
    }

    @Override
    public void AdaugaNod(StructuraAbs structuraAbs) {
        structuriList.add(structuraAbs);
    }

    @Override
    public StructuraAbs getNodCopil(int index) {
        return structuriList.get(index);
    }

    @Override
    public void afiseazaDescriere(String tab) {
        System.out.println(tab + "Departamentul: "+ this.getNume() + " contine urmatoarele subdepartamente: ");
        for(StructuraAbs str : structuriList)
        {
            str.afiseazaDescriere(tab+ "   ");
        }
    }


    @Override
    public int calculeazaNumarAngajati() {
        int sum = 0;
        for(StructuraAbs structura :structuriList)
        {
          sum = sum+structura.calculeazaNumarAngajati();
        }
        return sum + this.getNumarAngajati();
    }
}
