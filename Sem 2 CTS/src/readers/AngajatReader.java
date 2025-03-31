package readers;

import clase.Angajat;
import clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends BaseReader {
    public AngajatReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        List<Aplicant> angajati = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(super.getFileName()))) {
            scanner.useDelimiter(",");

            while (scanner.hasNext()) {
                Angajat angajat = new Angajat();
                citireAplicant(angajat, scanner);

                if (scanner.hasNextInt()) {
                    angajat.setSalariu(scanner.nextInt());
                }
                if (scanner.hasNext()) {
                    angajat.setOcupatie(scanner.next());
                }

                angajati.add(angajat);
            }
        }

        return angajati;
    }
}
