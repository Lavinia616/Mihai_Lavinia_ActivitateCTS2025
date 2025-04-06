package clase;

public class AdaptorMedicament extends MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public AdaptorMedicament(String denumire, int pret, boolean esteInStoc, String dataExpirarii) {
        super(denumire, pret, esteInStoc, dataExpirarii);
    }

    public AdaptorMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getDenumire(), medicamentSpital.getPret(), true, "24/08/2027");
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }
}
