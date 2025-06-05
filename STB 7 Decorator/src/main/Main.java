package main;

import clase.Bilet;
import clase.BiletLaMultiAni;
import clase.BiletSimplu;

public class Main {
    public static void main(String[] args) {
        Bilet biletNormal = new BiletSimplu();
        biletNormal.printeaza();

        System.out.println("---");

        Bilet biletCuFelicitare = new BiletLaMultiAni(new BiletSimplu());
        biletCuFelicitare.printeaza();
    }
}