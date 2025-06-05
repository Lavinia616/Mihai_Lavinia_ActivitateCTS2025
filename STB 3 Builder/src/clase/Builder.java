package clase;

public class Builder {
    private final String model;
    private final String sofer;
    private boolean opriri = true;
    private boolean autoUsi = true;
    private String afisaj = "Linie STB";

    public Builder(String model, String sofer) {
        this.model = model;
        this.sofer = sofer;
    }

    public Builder setOpriri(boolean opriri) {
        this.opriri = opriri;
        return this;
    }

    public Builder setAutoUsi(boolean autoUsi) {
        this.autoUsi = autoUsi;
        return this;
    }

    public Builder setAfisaj(String afisaj) {
        this.afisaj = afisaj;
        return this;
    }

    public AutobuzLinie build() {
        return new AutobuzLinie(this);
    }

    // Getters
    public String getModel() { return model; }
    public String getSofer() { return sofer; }
    public boolean isOpriri() { return opriri; }
    public boolean isAutoUsi() { return autoUsi; }
    public String getAfisaj() { return afisaj; }
}

