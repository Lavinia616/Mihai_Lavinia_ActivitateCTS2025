package readers;

import clase.Aplicant;
import clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsReader extends BaseReader {
    public StudentsReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        List<Aplicant> studenti = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(super.getFileName()))) {
            scanner.useDelimiter(",|\n");

            while (scanner.hasNext()) {
                Student student = new Student();
                citireAplicant(student, scanner);

                if (scanner.hasNextInt()) {
                    student.setAnStudii(scanner.nextInt());
                }
                if (scanner.hasNext()) {
                    student.setFacultate(scanner.next());
                }

                studenti.add(student);
            }
        }

        return studenti;
    }
}
