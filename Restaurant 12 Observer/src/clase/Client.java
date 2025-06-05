package clase;

public class Client implements Observer {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    public void primesteNotificare(String mesaj) {
        System.out.println(nume + " a primit: " + mesaj);
    }
}

