package Cursisten;

import java.time.LocalDate;

public class cursist {
    private String emailAdres;
    private String naam;
    private LocalDate geboorteDatum;
    private String geslacht;
    private String adres;
    private String woonplaats;
    private String land;

    public cursist(String emailAdres, String naam, LocalDate geboorteDatum, String geslacht, String adres,
            String woonplaats, String land) {
        this.emailAdres = emailAdres;
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
        this.geslacht = geslacht;
        this.adres = adres;
        this.woonplaats = woonplaats;
        this.land = land;
    }

    public String getEmailAdres() {
        return emailAdres;
    }

    public void setEmailAdres(String emailAdres) {
        this.emailAdres = emailAdres;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

}
