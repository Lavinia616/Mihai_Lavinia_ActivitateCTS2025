package clase;

public class BiletLaMultiAni extends BiletDecorator {
    public BiletLaMultiAni(Bilet bilet) {
        super(bilet);
    }

    public void printeaza() {
        super.printeaza();
        System.out.println("La multi ani cu ocazia zilei nationale!");
    }
}

