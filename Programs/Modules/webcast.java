package Modules;

public class webcast {
    private String titel;
    private String beschrijving;
    private String naamSpreker;
    private String organisatieSpreker;

    public webcast(String titel, String beschrijving, String naamSpreker, String organisatieSpreker) {
        this.titel = titel;
        this.beschrijving = beschrijving;
        this.naamSpreker = naamSpreker;
        this.organisatieSpreker = organisatieSpreker;
    }

    public String getTitel() {
        return titel;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public String getNaamSpreker() {
        return naamSpreker;
    }

    public String getOrganisatieSpreker() {
        return organisatieSpreker;
    }

}
