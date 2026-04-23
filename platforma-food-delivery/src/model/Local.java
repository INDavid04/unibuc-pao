package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.lang.Comparable;

public class Local implements Comparable<Local> {
    /// Atribute
    private String denumire;
    private List<Recenzie> recenzii;

    /// Constructor
    public Local(String denumire) {
        this.denumire = denumire;
        this.recenzii = new ArrayList<>();
    }

    /// Getteri
    public String getDenumire() {
        return denumire;
    }

    public List<Recenzie> getRecenzii() { return recenzii; }

    /// Setter
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    ///  Adauga recenzie
    public void adaugaRecenzie(Recenzie recenzie) {
        recenzii.add(recenzie);
    }

    /// Modifica recenzie
    public void modificaRecenzie(LocalDateTime data_postarii, int numar_stele) {
        for (Recenzie recenzie : recenzii) {
            if (data_postarii.equals(recenzie.getData_postarii())) {
                recenzie.setData_postarii(data_postarii);
                recenzie.setNumar_stele(numar_stele);
            }
        }
    }

    /// Sterge recenzie
    public void stergeRecenzie(LocalDateTime data_postarii) {
        for (int i = 0; i < recenzii.size(); i++) {
            if (recenzii.get(i).getData_postarii().equals(data_postarii)) {
                recenzii.remove(i);
                break;
            }
        }
    }

    /// Permite localurile sa fie comparate
    @Override
    public int compareTo(Local o) {
        return this.denumire.compareTo(o.denumire);
    }
}
