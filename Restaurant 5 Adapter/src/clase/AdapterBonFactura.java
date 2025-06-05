package clase;

public class AdapterBonFactura implements PrintabilFactura {
    private SoftBarNou softBarNou;

    public AdapterBonFactura(SoftBarNou softBarNou) {
        this.softBarNou = softBarNou;
    }

    public void printareFactura() {
        softBarNou.tiparesteBon();  // adaptare
    }
}
