package model;

import java.util.List;

public class Comanda {
    /// Atribute
    private int id_comanda;
    private List<Produs> produse;

    /// Constructor
    public Comanda(int id_comanda, List<Produs> produse) {
        this.id_comanda = id_comanda;
        this.produse = produse;
    }

    ///  Getteri
    public int getId_comanda() {
        return id_comanda;
    }

    public List<Produs> getProduse() {
        return produse;
    }

    /// Setteri
    public void setId_comanda(int id_comanda) {
        this.id_comanda = id_comanda;
    }

    public void setProduse(List<Produs> produse) {
        this.produse = produse;
    }
}
