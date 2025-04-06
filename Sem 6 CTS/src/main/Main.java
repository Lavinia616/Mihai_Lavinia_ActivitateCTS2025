package main;


import clase.AdaptorMedicament;
import clase.MedicamentFarmacie;
import clase.MedicamentSpital;

public class Main {

    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        //alegem adapter de obiecte deoarece nu folosim interfata, e nevoie de o interfata pt ca un adapter de clase nu poate extinde 2 clase simultan
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Prozac", 20, true, "20/03/2028");
        vindeMedicament(medicamentFarmacie);

        MedicamentSpital medicamentSpital = new MedicamentSpital("Zoloft", 40);
        AdaptorMedicament adaptorMedicament = new AdaptorMedicament(medicamentSpital);
        vindeMedicament(adaptorMedicament);

    }
}