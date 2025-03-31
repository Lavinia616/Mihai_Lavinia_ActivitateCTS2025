package ro.cts.pachet.Singleton.main;

import ro.cts.pachet.Singleton.clase.AgentieImobiliaraEager;
import ro.cts.pachet.Singleton.clase.AgentieImobiliaraLazy;

public class Main {
    public static void main(String[] args) {

        AgentieImobiliaraEager agentieImobiliara= AgentieImobiliaraEager.getAgentieImobiliara();

        AgentieImobiliaraEager agentie2 = AgentieImobiliaraEager.getAgentieImobiliara();
        agentie2.posteazaAnunt("anunt 1");
        agentieImobiliara.posteazaAnunt("anunt 2");
        agentie2.setSite("SiteNou.com");
        System.out.println(agentieImobiliara.toString());

        AgentieImobiliaraLazy agentieImobiliaraLazy= AgentieImobiliaraLazy.getAgentieImobiliara("Agentie 3",14,"SiteLazy.com",123000);
        AgentieImobiliaraLazy agentieImobiliaraLazy2= AgentieImobiliaraLazy.getAgentieImobiliara("Agentie 4",13,"SiteLazy2.com",123000);


        System.out.println(agentieImobiliaraLazy2.toString());

    }
}
//eager initialization creeaza inca de cand se importa clasa AgentieImobiliara