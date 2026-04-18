package model;

public class Produs {
    /// Atribute
    private String denumire;
    private int cantitate;

    /// Constructor
    public Produs(String denumire, int cantitate) {
        this.denumire = denumire;
        this.cantitate = cantitate;
    }

    /// Getter
    public String getDenumire() {
        return denumire;
    }

    public int getCantitate() {
        return cantitate;
    }

    /// Setter
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
}
