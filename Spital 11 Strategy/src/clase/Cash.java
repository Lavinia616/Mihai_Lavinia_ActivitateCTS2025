package clase;

public class Cash implements IMetodaPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Suma de "+suma+" lei a fost platita cash.");
    }
}
