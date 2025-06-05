package clase;

public class Internare implements Command {
    private Medic medic;
    private Pacient pacient;

    public Internare(Medic medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    public void executa() {
        medic.interneaza(pacient);
    }
}
