package main;

import bucatarie.Bucatarie;
import bucatarie.TipSupa;
import clase.Supa;



public class Main {
    public static void main(String[] args) {
        Bucatarie bucatarie = new Bucatarie(250, 25.5f);
        Supa supaLegume = bucatarie.getSupa(TipSupa.LEGUME, true, false);
        Supa supaVita = bucatarie.getSupa(TipSupa.VITA, false, true);

        supaLegume.afiseazaDescriere();
        supaVita.afiseazaDescriere();
    }
}