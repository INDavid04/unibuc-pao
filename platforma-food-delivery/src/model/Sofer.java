package model;

import java.util.Set;

public class Sofer extends Utilizator {
    /// Atribut
    private Set<Comanda> comenzi;

    /// Constructor
    public Sofer(int id, String nume, String mail, Set<Comanda> comenzi) {
        super(id, nume, mail);
        this.comenzi = comenzi;
    }

    /// Getter
    public Set<Comanda> getComenzi() {
        return comenzi;
    }

    /// Setter
    public void setComenzi(Set<Comanda> comenzi) {
        this.comenzi = comenzi;
    }
}
