package main;

import model.Local;
import service.SistemService;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        SistemService service = new SistemService();

        /// 1. Adauga un utilizator (manager/client/sofer)
        service.adaugaManager(101, "Vlad Marcel", "vlad_marcel@fooddelivery.ro", 101);
        service.adaugaClient(231, "Mia Tia", "mia_tia@fooddelivery.ro", "+40712345678");
        service.adaugaClient(589, "Ion Popescu", "ion_popescu@fooddelivery.ro", "+40709876543");

        /// 2. Adauga un local
        service.adaugaLocal("Luca");
        service.adaugaLocal("KFC");
        service.adaugaLocal("McDonald's");
        service.adaugaLocal("Burger King");

        /// 3. Adauga o comanda
        service.adaugaComanda(972);

        /// 4. Adauga un produs
        service.adaugaProdus(972, "Pizza", 2);
        service.adaugaProdus(972, "Pepsi", 3);
        service.adaugaProdus(972, "Clatite", 5);

        /// 5. Adauga o adresa
        service.adaugaAdresa(972, "Romania", "Bucuresti", "Popa Nan", 101);

        /// 6. Adauga o recenzie
        service.adaugaRecenzie("Luca", LocalDateTime.now(), 5);
        service.adaugaRecenzie("KFC", LocalDateTime.now(), 3);
        service.adaugaRecenzie("Burger King", LocalDateTime.now(), 2);
        service.adaugaRecenzie("McDonald's", LocalDateTime.now(), 4);

        /// 7. Actualizeaza o adresa (redirectionare comanda)
        service.actualizeazaAdresa(972, "Olanda", "Haga", "Grote Markstraat", 97);

        /// 8. Modifica o recenzie
        service.modificaRecenzie("KFC", LocalDateTime.now(), 5);

        /// 9. Sterge o recenzie
        service.stergeRecenzie("Burger King", LocalDateTime.now());

        /// 10. Afiseaza localurile in ordine alfabetica
        service.afiseazaLocaluriAlfabetic();

        /// 11. Afiseaza recenziile dupa data postarii
        service.afiseazaRecenziiDupaData();

        /// 12. Afiseaza recenziile dupa numarul de stele
        service.afiseazaRecenziiDupaStele();
    }
}
