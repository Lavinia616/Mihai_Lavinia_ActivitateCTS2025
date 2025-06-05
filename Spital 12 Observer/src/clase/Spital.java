package clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subject{
    private List<Observer> pacienti = new ArrayList<>();
    @Override
    public void adaugaObserver(Observer observer) {
        pacienti.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        pacienti.remove(observer);
    }

    @Override
    public void notificaObserveri(String mesaj) {
        for (Observer pacient : pacienti) {
            pacient.primesteNotificare(mesaj);
        }
    }
}
