package Cursusen;

public class cursus {
    private String cursusNaam;
    private String onderwerp;
    private String introductieTekst;

    public cursus(String cursusNaam, String onderwerp, String introductieTekst) {
        this.cursusNaam = cursusNaam;
        this.onderwerp = onderwerp;
        this.introductieTekst = introductieTekst;
    }

    public String getCursusNaam() {
        return cursusNaam;
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public String getIntroductieTekst() {
        return introductieTekst;
    }

}