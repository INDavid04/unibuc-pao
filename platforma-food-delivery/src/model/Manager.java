package model;

public class Manager extends Utilizator {
    /// Atribut
    private int id_manager;

    /// Constructor
    public Manager(int id, String nume, String mail, int id_manager) {
        super(id, nume, mail);
        this.id_manager = id_manager;
    }

    /// Getter
    public int getId_manager() {
        return id_manager;
    }

    /// Setter
    public void setId_manager(int id_manager) {
        this.id_manager = id_manager;
    }
}
