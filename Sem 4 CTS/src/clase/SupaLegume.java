package clase;

public class SupaLegume extends Supa {
    private static int discount;

    public SupaLegume(int cantitate, float pret, Boolean areArdei, Boolean areSmantana) {
        super(cantitate, pret, areArdei, areSmantana);
    }



    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de legume: " + getPret());
    }

    @Override
    public float calculeazaPretFinal() {
        return super.getPret() - super.getPret()*discount;
    }
}
