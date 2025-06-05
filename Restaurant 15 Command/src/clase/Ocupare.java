package clase;

public class Ocupare implements Command{
    private Masa masa;

    public Ocupare(Masa masa) {
        this.masa = masa;
    }

    public void executa() {
        masa.ocupa();
    }
}
