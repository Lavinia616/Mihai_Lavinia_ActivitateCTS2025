package clase;

public class AutobuzLinie {
    private final String model;
    private final String sofer;
    private final boolean opriri;
    private final boolean autoUsi;
    private final String afisaj;

    // Constructor privat – poate fi apelat doar din Builder
    AutobuzLinie(Builder builder) {
        this.model = builder.getModel();
        this.sofer = builder.getSofer();
        this.opriri = builder.isOpriri();
        this.autoUsi = builder.isAutoUsi();
        this.afisaj = builder.getAfisaj();
    }

    public void afiseazaDetalii() {
        System.out.println("Model: " + model + ", Sofer: " + sofer + ", Opriri: " + opriri +
                ", AutoUși: " + autoUsi + ", Afișaj: " + afisaj);
    }
}

