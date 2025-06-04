package main;


import clase.MetrouBucuresti;
import clase.MetrouSpecial;
import clase.TemplateMetrou;

public class Main {
    public static void main(String[] args) {
        TemplateMetrou m1=new MetrouBucuresti(5);
        m1.circulaTur();

        TemplateMetrou m2=new MetrouSpecial();
        m2.circulaTur();

    }
}
