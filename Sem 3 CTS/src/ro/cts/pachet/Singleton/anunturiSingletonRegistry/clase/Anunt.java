package ro.cts.pachet.Singleton.anunturiSingletonRegistry.clase;

public class Anunt {
    private String adresa;
    private String proprietar;
    private int nrCamere;
   private int codAnunt;

    protected Anunt(String adresa, String proprietar, int nrCamere, int codAnunt) {
        this.adresa = adresa;
        this.proprietar = proprietar;
        this.nrCamere = nrCamere;
        this.codAnunt = codAnunt;
    }
    @Override
    public String toString() {
        return "Anunt{" +
                "adresa='" + adresa + '\'' +
                ", proprietar='" + proprietar + '\'' +
                ", nrCamere=" + nrCamere +
                ", codAnunt=" + codAnunt +
                '}';
    }
}
