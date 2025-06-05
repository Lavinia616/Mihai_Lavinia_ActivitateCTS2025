package clase;

public class Masa {
    private int nr;
    private Stare stare;

    public Masa(int nr) {
        this.nr = nr;
        this.stare = new Libera();
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void afiseazaStare() {
        stare.afiseazaStare(nr);
    }
}
