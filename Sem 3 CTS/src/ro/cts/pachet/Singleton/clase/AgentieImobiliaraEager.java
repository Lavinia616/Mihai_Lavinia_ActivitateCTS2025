package ro.cts.pachet.Singleton.clase;

public class AgentieImobiliaraEager {
    private String nume;
    private int numarAnunturi;
    private String site;
    private float cifraAfaceri;
    private static AgentieImobiliaraEager agentieImobiliara = new AgentieImobiliaraEager("Agentie", 10, "Agentie.com", 120000);

    private AgentieImobiliaraEager(String nume, int numarAnunturi, String site, float cifraAfaceri) {
        this.nume = nume;
        this.numarAnunturi = numarAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }

    public static AgentieImobiliaraEager getAgentieImobiliara() {
        return agentieImobiliara;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void posteazaAnunt(String anunt)
    {
        this.numarAnunturi++;
    }

    @Override
    public String toString() {
        return "AgentieImobiliara{" +
                "nume='" + nume + '\'' +
                ", numarAnunturi=" + numarAnunturi +
                ", site='" + site + '\'' +
                ", cifraAfaceri=" + cifraAfaceri +
                '}';
    }
}
