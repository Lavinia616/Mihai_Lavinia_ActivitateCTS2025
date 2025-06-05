package clase;

public class Tratament implements Command{

    private Medic medic;
    private Pacient pacient;

    public Tratament(Medic medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    public void executa() {
        medic.trateaza(pacient);
    }
}
