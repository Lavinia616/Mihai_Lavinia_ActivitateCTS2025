package clase;

public class SupaVita extends Supa {

    private static int discount;

    public SupaVita(int cantitate, float pret, Boolean areArdei, Boolean areSmantana) {
        super(cantitate, pret, areArdei, areSmantana);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de vita: " + getPret());
    }

    @Override
    public float calculeazaPretFinal() {
        return 0;
    }
}
