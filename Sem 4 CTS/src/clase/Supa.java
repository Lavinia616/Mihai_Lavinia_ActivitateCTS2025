package clase;

public abstract class Supa {

    private int cantitate;
    private float pret;
    private Boolean areArdei;
    private Boolean areSmantana;

    public float getPret() {
        return pret;
    }

    public Supa(int cantitate, float pret, Boolean areArdei, Boolean areSmantana) {
        this.cantitate = cantitate;
        this.pret = pret;
        this.areArdei = areArdei;
        this.areSmantana = areSmantana;
    }

    private float getPretTotal(){
        return this.pret * this.cantitate;
    }

    public abstract void afiseazaDescriere();

    public abstract float calculeazaPretFinal();
}
