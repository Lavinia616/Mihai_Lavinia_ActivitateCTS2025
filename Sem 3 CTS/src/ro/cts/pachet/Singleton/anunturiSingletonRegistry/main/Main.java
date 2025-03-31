package ro.cts.pachet.Singleton.anunturiSingletonRegistry.main;

import ro.cts.pachet.Singleton.anunturiSingletonRegistry.clase.Agentie;
import ro.cts.pachet.Singleton.anunturiSingletonRegistry.clase.Anunt;

public class Main {
    public static void main(String[] args) {

        Agentie agentie =new Agentie("Imobiliare.ro",123400);
        Anunt anunt= agentie.getAnunt("Romana","Popescu Ilie", 3);
        Anunt anunt2= agentie.getAnunt("Piata Universitatii nr 10","Ionescu Ilie", 2);
        Anunt anunt3= agentie.getAnunt("Romana","Popescu Marian", 3);
        System.out.println(anunt);
        System.out.println(anunt2);
        System.out.println(anunt3);
    }
}
