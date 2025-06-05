package clase;

public abstract class Template {
    protected Pacient pacient;

    public Template(Pacient pacient) {
        this.pacient = pacient;
    }

    public final void interneazaPacient() {
        analizeazaStare();
        verificaDisponibilitate();
        emiteFisa();
    }

    protected abstract void analizeazaStare();
    protected abstract void verificaDisponibilitate();
    protected abstract void emiteFisa();
}
