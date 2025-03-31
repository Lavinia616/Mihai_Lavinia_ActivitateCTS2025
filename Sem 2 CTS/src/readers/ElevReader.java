package readers;

import clase.Aplicant;
import clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends BaseReader {
    public ElevReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        List<Aplicant> elevi = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(super.getFileName()))) {
            scanner.useDelimiter(",|\n");

            while (scanner.hasNext()) {
                Elev elev = new Elev();
                citireAplicant(elev, scanner);

                if (scanner.hasNextInt()) {
                    elev.setClasa(scanner.nextInt());
                }
                if (scanner.hasNext()) {
                    elev.setTutore(scanner.next());
                }

                elevi.add(elev);
            }
        }

        return elevi;
    }
}
