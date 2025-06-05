package main;

import clase.*;

public class Main {

    public static void main(String[] args) {

        PrintabilFactura factura = new AdapterBonFactura(new SoftBarNou());
        factura.printareFactura();
    }
}