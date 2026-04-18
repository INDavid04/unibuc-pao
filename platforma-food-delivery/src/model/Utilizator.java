package model;

public abstract class Utilizator {
    /// Atribute
    private int id;
    private String nume;
    private String mail;

    ///  Constructor
    public Utilizator(int id, String nume, String mail) {
        this.id = id;
        this.nume = nume;
        this.mail = mail;
    }

    /// Getteri
    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getMail() {
        return mail;
    }

    /// Setteri
    public void setId(int id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
