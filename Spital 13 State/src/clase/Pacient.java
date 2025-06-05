package clase;

public class Pacient {
    private String nume;
    private int varsta;
    private State stare;

    public Pacient(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        this.stare = new Internat(); // stare inițială
    }

    public void setStare(State stare) {
        this.stare = stare;
    }

    public void afiseazaStare() {
        stare.afiseazaStare();
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }
}

