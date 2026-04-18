package model;

import java.time.LocalDateTime;

public class Recenzie {
    /// Atribute
    private LocalDateTime data_postarii;
    private int numar_stele;

    /// Constructor
    public Recenzie(LocalDateTime data_postarii, int numar_stele) {
        this.data_postarii = data_postarii;
        this.numar_stele = numar_stele;
    }

    /// Getteri
    public LocalDateTime getData_postarii() {
        return data_postarii;
    }

    public int getNumar_stele() {
        return numar_stele;
    }

    /// Setteri
    public void setData_postarii(LocalDateTime data_postarii) {
        this.data_postarii = data_postarii;
    }

    public void setNumar_stele(int numar_stele) {
        this.numar_stele = numar_stele;
    }
}
