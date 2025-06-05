package clase;

public class Facade {
    private final Usa fata = new Usa("fata");
    private final Usa mijloc = new Usa("mijloc");
    private final Usa spate = new Usa("spate");

    public void toatePeLiber() {
        fata.liber(); mijloc.liber(); spate.liber();
    }

    public void deschideToate() {
        fata.deschideFortat(); mijloc.deschideFortat(); spate.deschideFortat();
    }
}
