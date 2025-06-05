package clase;

import java.util.HashMap;
import java.util.Map;

public class TransportSingletonFactory {
    private static final Map<TipTransport, MijlocTransport> instanta = new HashMap<>();

    public static MijlocTransport getTransport(TipTransport tip) {
        if (!instanta.containsKey(tip)) {
            instanta.put(tip, TransportFactory.creare(tip));
        }
        return instanta.get(tip);
    }
}
