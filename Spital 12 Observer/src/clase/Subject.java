package clase;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void notificaObserveri(String mesaj);
}
