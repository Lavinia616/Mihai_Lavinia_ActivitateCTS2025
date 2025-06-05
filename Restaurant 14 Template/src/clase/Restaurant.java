package clase;

public class Restaurant extends Template {
    @Override
    protected void curataMasa() {
        System.out.println("Se curata masa...");
    }

    @Override
    protected void puneServetele() {
        System.out.println("Se pun servetelele...");
    }

    @Override
    protected void puneTacamuri() {
        System.out.println("Se pun tacamurile...");
    }

    @Override
    protected void aseazaPersoaneLaMasa() {
        System.out.println("Clientii sunt invitati la masa.");
    }
}
