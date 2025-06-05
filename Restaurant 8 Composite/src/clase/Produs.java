package clase;

public class Produs implements ElementMeniu {
    private String nume;

    public Produs(String nume) {
        this.nume = nume;
    }

    public void afiseaza(String indentare) {
        System.out.println(indentare + "- " + nume);
    }
}
