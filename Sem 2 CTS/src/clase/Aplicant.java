package clase;

public abstract class Aplicant {
	private String nume;
	private String prenume;
	private int varsta;
	private int punctaj;
	private int numarProiecte;
	private String[] denumiriProiecte;
	private static final int PUNCTAJ_MINIM = 80;

	public Aplicant() {
		// Constructor implicit
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumiriProiecte) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numarProiecte = numarProiecte;
		this.denumiriProiecte = denumiriProiecte;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public int getNumarProiecte() {
		return numarProiecte;
	}

	public void setNumarProiecte(int numarProiecte, String[] denumiriProiecte) {
		this.numarProiecte = numarProiecte;
		this.denumiriProiecte = denumiriProiecte;
	}

	public String[] getDenumiriProiecte() {
		return denumiriProiecte;
	}

	public void setDenumiriProiecte(String[] denumiriProiecte) {
		this.denumiriProiecte = denumiriProiecte;
	}

	public void afisareStatut() {
		System.out.printf("Aplicantul %s %s %s fost acceptat.%n",
				nume, prenume, (punctaj >= PUNCTAJ_MINIM) ? "" : "nu ");
	}

	public abstract int finantare(); // Obligă subclasele să implementeze metoda
}
