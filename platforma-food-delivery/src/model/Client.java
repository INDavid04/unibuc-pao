package model;

public class Client extends Utilizator {
    /// Atribut
    private String telefon;

    /// Constructor
    public Client(int id, String nume, String mail, String telefon) {
        super(id, nume, mail);
        this.telefon = telefon;
    }

    /// Getter
    public String getTelefon() {
        return telefon;
    }

    /// Setter
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
