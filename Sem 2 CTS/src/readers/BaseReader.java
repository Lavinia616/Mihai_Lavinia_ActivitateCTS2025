package readers;

import clase.Aplicant;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class BaseReader {
    protected final String fileName;

    public BaseReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    public void citireAplicant(Aplicant aplicant, Scanner scanner) {
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int numarProiecte = scanner.nextInt();

        String[] denumiriProiecte = new String[numarProiecte];
        for (int i = 0; i < numarProiecte; i++) {
            denumiriProiecte[i] = scanner.next();
        }

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNumarProiecte(numarProiecte, denumiriProiecte);
    }
}
