package clase;

public class Card implements ModPlata {
    public void plateste(double suma) {
        System.out.println("Plata cu cardul: " + suma + " RON");
    }
}
