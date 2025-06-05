package clase;

public class Medic {
    public void interneaza(Pacient pacient) {
        System.out.println("Internare pentru " + pacient.getNume());
    }

    public void trateaza(Pacient pacient) {
        System.out.println("Tratament pentru " + pacient.getNume());
    }
}
