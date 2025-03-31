package clase;

import java.util.Arrays;

public class Student extends Aplicant {
	private String facultate;
	private int anStudii;

	public Student() {
		super();
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int numarProiecte,
				   String[] denumiriProiecte, String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, numarProiecte, denumiriProiecte);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		return String.format("Student: Nume=%s, Prenume=%s, Varsta=%d, Punctaj=%d, NrProiecte=%d, DenumiriProiecte=%s, Facultate=%s, AnStudii=%d",
				getNume(), getPrenume(), getVarsta(), getPunctaj(), getNumarProiecte(), Arrays.toString(getDenumiriProiecte()), facultate, anStudii);
	}

	@Override
	public int finantare() {
		int sumaFinantare = 20;
		System.out.printf("Studentul %s %s primește %d Euro/zi în proiect.%n", getNume(), getPrenume(), sumaFinantare);
		return sumaFinantare;
	}
}
