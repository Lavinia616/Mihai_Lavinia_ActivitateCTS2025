package clase;

public class AutobuzDeNoapte implements AutobuzAbstract {
    private final int nrCalatori;

    public AutobuzDeNoapte(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    public void opresteInStatie() {
        System.out.println("Autobuzul opreste in statie cu " + nrCalatori + " calatori");
    }

    public int getNrCalatori() {
        return nrCalatori;
    }
}
