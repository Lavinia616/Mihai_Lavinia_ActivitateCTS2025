package Program;

import Clase.AbstractBuilder;
import Clase.Pacient;
import Clase.PacientBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder("George");
        Pacient pacient1 = pacientBuilder.setNumeInsotitor("Andrei").setAreHalat(true).getPacient();
        System.out.println(pacient1.toString());
        //pacient1.setNumeInsotitor("Alex"); nu e posibil daca facem setter protected

        Pacient pacient2 = pacientBuilder.setNumeInsotitor("Insotitor2").setAreMicDejun(true).getPacient();
        System.out.println(pacient1.toString()); //builder creeaza o singura instanta
        System.out.println(pacient2.toString());

    }
}