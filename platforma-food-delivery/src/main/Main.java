package main;

import service.SistemService;
import.java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        SistemService service = new SistemService();

        /// 1. Adauga un utilizator (manager/client/sofer)
        service.adaugaManager(101, "Vlad Marcel", "vlad_marcel@fooddelivery.ro", 101);

        /// 2. Adauga un local

        /// 3. Adauga o comanda

        /// 4. Adauga un produs

        /// 5. Adauga o adresa

        /// 6. Adauga o recenzie

        /// 7. Actualizeaza o adresa (redirectionare comanda)

        /// 8. Modifica o recenzie

        /// 9. Sterge o recenzie

        /// 10. Afiseaza localurile in ordine alfabetica

        /// 11. Afiseaza recenziile dupa data postarii

        /// 12. Afiseaza recenziile dupa numarul de stele
    }
}
