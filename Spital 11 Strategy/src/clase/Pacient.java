package clase;

import java.lang.reflect.Method;

public class Pacient {
    private String nume;
    private IMetodaPlata metodaPlata;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void efectueazaPlata(double suma){
        if (metodaPlata!=null)
        {
            System.out.println(nume + ":");
            metodaPlata.plateste(suma);

        }else {
            System.out.println("Modul de plata nu este setat pentru "+ nume);
        }
    }
}
