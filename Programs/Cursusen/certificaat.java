package Cursusen;

public class certificaat {
    private Double cijfer;
    private String naamMedewerker;

    public certificaat(Double cijfer, String naamMedewerker) {
        this.cijfer = cijfer;
        this.naamMedewerker = naamMedewerker;
    }

    public Double getCijfer() {
        return cijfer;
    }

    public String getNaamMedewerker() {
        return naamMedewerker;
    }

}
