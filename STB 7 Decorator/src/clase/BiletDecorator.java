package clase;

public class BiletDecorator implements Bilet {
    protected Bilet bilet;

    public BiletDecorator(Bilet bilet) {
        this.bilet = bilet;
    }

    public void printeaza() {
        bilet.printeaza();
    }
}
