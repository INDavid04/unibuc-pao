package service;

import model.*;

import java.time.LocalDateTime;
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
    public void adaugaComanda(int id_comanda) {
        comenzi.add(new Comanda(id_comanda));
    }

    /// Adauga produs
    public void adaugaProdus(int id_comanda, String denumire, int cantitate) {
        for (Comanda comanda : comenzi) {
            if (id_comanda == comanda.getId_comanda()) {
                comanda.adaugaProdus(new Produs(denumire, cantitate));
            }
        }
    }

    /// Adauga adresa
    public void adaugaAdresa(int id_comanda, String tara, String localitate, String strada, int numar) {
        for (Comanda comanda : comenzi) {
            if (id_comanda == comanda.getId_comanda()) {
                comanda.adaugaAdresa(new Adresa(tara, localitate, strada, numar));
            }
        }
    }

    /// Adauga recenzie
    public void adaugaRecenzie(String denumire_local, LocalDateTime data_postarii, int numar_stele) {
        boolean gasit = false;
        for (Local local : localuri) {
            if (local.getDenumire().equals(denumire_local)) {
                local.adaugaRecenzie(new Recenzie(data_postarii, numar_stele));
                gasit = true;
                break;
            }
        }
        if (!gasit){
            System.out.print("Nu am gasit localul " + denumire_local);
        }
    }

    /// Actualizeaza adresa
    public void actualizeazaAdresa(int id_comanda, String noua_tara, String noua_localitate, String noua_strada, int noul_numar) {
        for (Comanda comanda : comenzi) {
            if (id_comanda == comanda.getId_comanda()) {
                comanda.modificaAdresa(noua_tara, noua_localitate, noua_strada, noul_numar);
            }
        }
    }

    /// Modifica Recenzie
    public void modificaRecenzie(String denumire_local, LocalDateTime data_postarii, int numar_stele) {
        boolean gasit = false;
        for (Local local : localuri) {
            if (local.getDenumire().equals(denumire_local)) {
                local.modificaRecenzie(data_postarii, numar_stele);
                gasit = true;
                break;
            }
        }
        if (!gasit) {
            System.out.print("Nu am gasit localul " + denumire_local);
        }
    }

    /// Sterge recenzie
    public void stergeRecenzie (String denumire_local, LocalDateTime data_postarii) {
        boolean gasit = false;
        for (Local local : localuri) {
            if (denumire_local.equals(local.getDenumire())) {
                local.stergeRecenzie(data_postarii);
                gasit = true;
                break;
            }
        }
        if (!gasit) {
            System.out.print("Nu am gasit localul " + denumire_local);
        }
    }

    /// Afiseaza localurile in ordine alfabetica
    public void afiseazaLocaluriAlfabetic() {
        System.out.println("Localurile in ordine alfabetica:");

        /// Datorita faptului ca localuri este un TreeSet, se vor sorta automat localurile in momentul adaugarii
        for (Local local : localuri) {
            System.out.println(local.getDenumire());
        }
    }

    /// Afiseaza recenziile dupa data postarii
    public void afiseazaRecenziiDupaData() {
        System.out.println("Recenziile dupa data postarii:");

        /// Strange toate recenziile din toate localurile
        List<Recenzie> toate_recenziile = new ArrayList<>();
        for (Local local : localuri) {
            toate_recenziile.addAll(local.getRecenzii());
        }

        /// Sorteaza toate recenziile dupa data postarii
        toate_recenziile.sort(Comparator.comparing(Recenzie::getData_postarii));

        /// Afiseaza recenziile dupa data postarii
        for (Recenzie recenzie : toate_recenziile) {
            System.out.println(recenzie.getData_postarii() + " - " + recenzie.getNumar_stele() + " stele");
        }
    }

    /// Afiseaza recenziile dupa numarul de stele
    public void afiseazaRecenziiDupaStele() {
        System.out.println("Recenziile dupa numarul de stele:");

        /// Strange toate recenziile din toate localurile
        List<Recenzie> toate_recenziile = new ArrayList<>();
        for (Local local : localuri) {
            toate_recenziile.addAll(local.getRecenzii());
        }

        /// Sorteaza toate recenziile dupa numarul de stele
        toate_recenziile.sort(Comparator.comparing(Recenzie::getNumar_stele).reversed());

        /// Afiseaza recenziile dupa numarul de stele
        for (Recenzie recenzie : toate_recenziile) {
            System.out.println(recenzie.getData_postarii() + " - " + recenzie.getNumar_stele() + " stele");
        }
    }
}
