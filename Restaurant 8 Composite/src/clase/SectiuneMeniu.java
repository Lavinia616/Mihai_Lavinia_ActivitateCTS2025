package clase;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu implements ElementMeniu {
    private String titlu;
    private List<ElementMeniu> elemente = new ArrayList<>();

    public SectiuneMeniu(String titlu) {
        this.titlu = titlu;
    }

    public void adauga(ElementMeniu element) {
        elemente.add(element);
    }

    public void afiseaza(String indentare) {
        System.out.println(indentare + "* " + titlu);
        for (ElementMeniu e : elemente) {
            e.afiseaza(indentare + "  ");
        }
    }
}
