package clase;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public void efectueazaPlata(double suma) {
        System.out.print(nume + " -> ");
        modPlata.plateste(suma);
    }
}
