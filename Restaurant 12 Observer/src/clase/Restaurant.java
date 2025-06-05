package clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Observer> clienti = new ArrayList<>();

    public void aboneaza(Observer client) {
        clienti.add(client);
    }

    public void trimiteOferta(String oferta) {
        for (Observer client : clienti) {
            client.primesteNotificare(oferta);
        }
    }
}
