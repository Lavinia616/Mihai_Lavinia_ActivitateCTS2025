package clase;

public class TransportFactory {
    public static MijlocTransport creare(TipTransport tip) {
        return switch (tip) {
            case AUTOBUZ -> new Autobuz();
            case TRAMVAI -> new Tramvai();
            case TROLEIBUZ -> new Troleibuz();
        };
    }
}
