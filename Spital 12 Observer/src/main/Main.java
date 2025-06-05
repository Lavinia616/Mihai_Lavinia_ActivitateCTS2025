package main;
import clase.*;
public class Main {
    public static void main(String[] args) {
        Spital spital = new Spital();

        Observer p1 = new Pacient("Andrei");
        Observer p2 = new Pacient("Maria");
        Observer p3 = new Pacient("Ioana");

        spital.adaugaObserver(p1);
        spital.adaugaObserver(p2);
        spital.adaugaObserver(p3);

        spital.notificaObserveri("Atenție! A apărut un nou virus respirator în oraș.");

        spital.stergeObserver(p2);

        spital.notificaObserveri("S-a emis o alertă de grad ridicat pentru epidemie.");
    }
}