import model.Book;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /// Cerința 1: Modelarea Datelor
        /// Creați clasa Produs cu următoarele atribute:
        ///     String id (identificator unic);
        ///     String nume;
        ///     String categorie;
        ///     int cantitate;
        /// Constrângeri:
        ///     Clasa trebuie să implementeze interfața Comparable<Produs>/Comparator<Produs></Produs></Produs> pentru a permite sortarea alfabetică după nume.
        ///     Suprascrieți metoda toString() pentru a afișa detaliile produsului într-un format lizibil.

        List<Produs> produse = new ArrayList<>();
        produse.add(new Produs("101", "Mousse", "Periferice IT", 7));
        produse.add(new Produs("102", "Tastatura", "Periferice IT", 2));
        produse.add(new Produs("103", "Nestea", "Alimente", 8));

        System.out.println("Inainte de sortare:");
        for (Produs produs : produse) {
            produs.afiseazaDetaliile();
        }
    }
}


