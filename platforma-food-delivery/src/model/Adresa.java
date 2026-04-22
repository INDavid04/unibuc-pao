package model;

public class Adresa {
    /// Atribute
    private String tara, localitate, strada;
    private int numar;

    /// Constructor
    public Adresa(String tara, String localitate, String strada, int numar) {
        this.tara = tara;
        this.localitate = localitate;
        this.strada = strada;
        this.numar = numar;
    }

    /// Getteri
    public int getNumar() {
        return numar;
    }

    public String getStrada() {
        return strada;
    }

    public String getLocalitate() {
        return localitate;
    }

    public String getTara() {
        return tara;
    }

    /// Setteri
    public void setTara(String tara) { this.tara = tara; }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }
}
