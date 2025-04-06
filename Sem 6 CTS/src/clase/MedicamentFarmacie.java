package clase;

public class MedicamentFarmacie {
    private String denumire;
    private int pret;
    private  boolean esteInStoc;
    private String dataExpirarii;

    public void cumparaMedicament(){
        System.out.println("Medicamentul " + denumire + " cu pretul de " + pret + "RON expira la data de " + dataExpirarii);
    }

    public MedicamentFarmacie(String denumire, int pret, boolean esteInStoc, String dataExpirarii) {
        this.denumire = denumire;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
        this.dataExpirarii = dataExpirarii;
    }
}
