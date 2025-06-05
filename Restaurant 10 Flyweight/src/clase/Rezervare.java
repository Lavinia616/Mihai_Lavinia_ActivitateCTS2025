package clase;

public class Rezervare {
    private int numarMasa;
    private int persoane;
    private String ora;
    private Client client;

    public Rezervare(int masa, int persoane, String ora, Client client) {
        this.numarMasa = masa;
        this.persoane = persoane;
        this.ora = ora;
        this.client = client;
    }

    public void afiseazaRezervare() {
        System.out.println("Rezervare: " + client.getNume() + " | Masa: " + numarMasa + " | Ora: " + ora);
    }
}
