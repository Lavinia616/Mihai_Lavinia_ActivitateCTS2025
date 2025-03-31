package clase;

public class SupaCiuperci extends Supa {

    private static int discount;

    public SupaCiuperci(int cantitate, float pret, Boolean areArdei, Boolean areSmantana) {
        super(cantitate, pret, areArdei, areSmantana);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de ciuperci: " + getPret());
    }

    @Override
    public float calculeazaPretFinal() {
        return 0;
    }
}
