package model;

import java.util.List;

public class Comanda {
    /// Atribute
    private int id_comanda;
    private List<Produs> produse;
    private Adresa adresa;

    /// Constructor
    public Comanda(int id_comanda) {
        this.id_comanda = id_comanda;
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

    /// Adauga un produs
    public void adaugaProdus(Produs produs) {
        this.produse.add(produs);
    }

    /// Adauga o adresa
    public void adaugaAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    /// Modifica o adresa
    public void modificaAdresa(String tara, String localitate, String strada, int numar) {
        this.adresa.setTara(tara);
        this.adresa.setLocalitate(localitate);
        this.adresa.setStrada(strada);
        this.adresa.setNumar(numar);
    }
}
