package clase;

public class Internare extends Template{
    public Internare(Pacient pacient) {
        super(pacient);
    }

    protected void analizeazaStare() {
        System.out.println("Analiza pacientului " + pacient.getNume() + " (" + pacient.getVarsta() + " ani)");
    }

    protected void verificaDisponibilitate() {
        System.out.println("Se verifica paturile libere...");
    }

    protected void emiteFisa() {
        System.out.println("Se emite fisa de internare pentru " + pacient.getNume());
    }
}
