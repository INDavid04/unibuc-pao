package service;

import model.*;
import java.util.*;

public class SistemService {
    /// Atribute
    private List<Utilizator> utilizatori = new ArrayList<>();
    private TreeSet<Local> localuri = new TreeSet<>();
    private List<Comanda> comenzi = new ArrayList<>();

    /// Adauga manager
    public void adaugaManager(int id, String nume, String mail, int id_manager) {
        utilizatori.add(new Manager(id, nume, mail, id_manager));
    }

    /// Adauga client
    public void adaugaClient(int id, String nume, String mail, String telefon) {
        utilizatori.add(new Client(id, nume, mail, telefon));
    }

    /// Adauga sofer
    public void adaugaSofer(int id, String nume, String mail, Set<Comanda> comenzi) {
        utilizatori.add(new Sofer(id, nume, mail, comenzi));
    }

    /// Adauga local
    public void adaugaLocal(String denumire) {
        localuri.add(new Local(denumire));
    }

    /// Adauga comanda
    public void adaugaComanda(int id_comanda, List<Produs> produse) {
        comenzi.add(new Comanda(id_comanda, produse));
    }

    /// Adauga produs

    /// Adauga adresa

    /// Adauga recenzie

    /// Actualizeaza adresa

    /// Modifica Recenzie

    /// Sterge recenzie

    /// Afiseaza localurile in ordine alfabetica

    /// Afiseaza recenziile dupa data postarii

    /// Afiseaza recenziile dupa numarul de stele
}
