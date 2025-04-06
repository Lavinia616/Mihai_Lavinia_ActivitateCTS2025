package clase;

public class MedicamentSpital {
    private String denumire;
    private int pret;

    public MedicamentSpital(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getPret() {
        return pret;
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("Este achizitionat medicamentul " + denumire + " cu pretul de: " + pret +  "RON.");
    }

    public void prezintaReteta(){
        System.out.println("A fost prezentata reteta");
    }
}
