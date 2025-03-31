package Clase;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciDeCamera;
    private boolean areHalat;
    private String numeInsotitor;

    public Pacient(String nume, boolean arePatRabatabil, boolean areMicDejun, boolean arePapuciDeCamera, boolean areHalat, String numeInsotitor) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuciDeCamera = arePapuciDeCamera;
        this.areHalat = areHalat;
        this.numeInsotitor = numeInsotitor;
    }

    public String getNume() {
        return nume;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isArePatRabatabil() {
        return arePatRabatabil;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public boolean isAreMicDejun() {
        return areMicDejun;
    }

    protected void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    public boolean isArePapuciDeCamera() {
        return arePapuciDeCamera;
    }

    protected void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    public boolean isAreHalat() {
        return areHalat;
    }

    protected void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    public String getNumeInsotitor() {
        return numeInsotitor;
    }

    protected void setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", arePatRabatabil=" + arePatRabatabil +
                ", areMicDejun=" + areMicDejun +
                ", arePapuciDeCamera=" + arePapuciDeCamera +
                ", areHalat=" + areHalat +
                ", numeInsotitor='" + numeInsotitor + '\'' +
                '}';
    }
}
