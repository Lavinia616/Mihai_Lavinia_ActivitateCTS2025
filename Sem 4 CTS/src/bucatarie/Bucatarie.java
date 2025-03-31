package bucatarie;

import clase.Supa;
import clase.SupaCiuperci;
import clase.SupaLegume;
import clase.SupaVita;

public class Bucatarie {
    private int cantitate;
    private float pret;

    public Bucatarie(int cantitate, float pret) {
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public Supa getSupa(TipSupa tipSupa, Boolean areArdei, Boolean areSmantana){
        switch(tipSupa){
            case CIUPERCI -> {return new SupaCiuperci(cantitate, pret, areArdei, areSmantana);}
            case VITA -> {return new SupaVita(cantitate, pret, areArdei, areSmantana);}
            case LEGUME -> {return new SupaLegume(cantitate, pret, areArdei, areSmantana);}
            default -> {return null;}
        }
    }
}
