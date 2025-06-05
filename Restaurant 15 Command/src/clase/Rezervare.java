package clase;

public class Rezervare implements Command{
    private Masa masa;

    public Rezervare(Masa masa) {
        this.masa = masa;
    }

    public void executa() {
        masa.rezerva();
    }
}
