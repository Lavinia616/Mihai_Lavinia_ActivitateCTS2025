package Main;

import Clase.Pacient;
import Clase.PacientBuilder;


public class Main {
    public static void main(String[] args) {

        PacientBuilder pacientBuilder = new PacientBuilder();
        pacientBuilder.setAreHalat(true).setAreMicDejun(true).setNumeInsotitor("Maria");

        Pacient pacient1 = pacientBuilder.setNumeInsotitor("Ion").build("Ana");
        System.out.println(pacient1.toString());

        Pacient pacient2 = pacientBuilder.setNumeInsotitor("Carina").build("Alexa");
        System.out.println(pacient2.toString());



    }
}