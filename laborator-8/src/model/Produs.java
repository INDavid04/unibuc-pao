/// Cerința 1: Modelarea Datelor
/// Creați clasa Produs cu următoarele atribute:
///     String id (identificator unic);
///     String nume;
///     String categorie;
///     int cantitate;
/// Constrângeri:
///     Clasa trebuie să implementeze interfața Comparable<Produs>/Comparator<Produs></Produs></Produs> pentru a permite sortarea alfabetică după nume.
///     Suprascrieți metoda toString() pentru a afișa detaliile produsului într-un format lizibil.

class Produs implements Comparable<Produs> {
    /// Atribute
    String id; /// identificator unic
    String nume;
    String categorie;
    int cantitate;

    /// Constructor
    public Produs(String id, String nume, String categorie, int cantitate) {
        this.id = id;
        this.nume = nume;
        this.categorie = categorie;
        this.cantitate = cantitate;
    }

    /// Sortare alfabetica dupa nume
    @Override
    public int compareTo(Produs altProdus) {
        return this.nume.compareTo(altProdus.nume);
    }

    /// Afiseaza detaliile produsului
    public String afiseazaDetaliile() {
        return "Produs (id: " + id + "; nume: " + nume + "; categorie: " + categorie + "; catitate: " + cantitate ")";
    }
}
