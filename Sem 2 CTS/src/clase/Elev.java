package clase;

import java.util.Arrays;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
				int numarProiecte, String[] denumiriProiecte, int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, numarProiecte, denumiriProiecte);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public int getClasa() {
		return clasa;
	}

	public void setClasa(int clasa) {
		this.clasa = clasa;
	}

	public String getTutore() {
		return tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		return String.format("Elev: Nume=%s, Prenume=%s, Varsta=%d, Punctaj=%d, NrProiecte=%d, DenumiriProiecte=%s, Clasa=%d, Tutore=%s",
				getNume(), getPrenume(), getVarsta(), getPunctaj(), getNumarProiecte(), Arrays.toString(getDenumiriProiecte()), clasa, tutore);
	}

	@Override
	public int finantare() {
		int sumaFinantare = 30;
		System.out.printf("Elevul %s %s primește %d Euro/zi în proiect.%n", getNume(), getPrenume(), sumaFinantare);
		return sumaFinantare;
	}
}
