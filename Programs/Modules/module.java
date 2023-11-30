package Modules;

public class module {
    private String title;
    private int versie;
    private String beschijving;
    private String naamContact;
    private String emailContact;

    public module(String title, int versie, String beschijving, String naamContact, String emailContact) {
        this.title = title;
        this.versie = versie;
        this.beschijving = beschijving;
        this.naamContact = naamContact;
        this.emailContact = emailContact;
    }

    public String getTitle() {
        return title;
    }

    public int getVersie() {
        return versie;
    }

    public String getBeschijving() {
        return beschijving;
    }

    public String getNaamContact() {
        return naamContact;
    }

    public String getEmailContact() {
        return emailContact;
    }

}