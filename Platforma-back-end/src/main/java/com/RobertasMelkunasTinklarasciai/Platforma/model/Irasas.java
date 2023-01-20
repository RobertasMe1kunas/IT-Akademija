package com.RobertasMelkunasTinklarasciai.Platforma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Irasas {


    @Id
    @GeneratedValue
    private Long id;
    private String antraste;
    private String tekstas;
    private String komentaras;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAntraste() {
        return antraste;
    }

    public void setAntraste(String antraste) {
        this.antraste = antraste;
    }

    public String getTekstas() {
        return tekstas;
    }

    public void setTekstas(String tekstas) {
        this.tekstas = tekstas;
    }

    public String getKomentaras() {
        return komentaras;
    }

    public void setKomentaras(String komentaras) {
        this.komentaras = komentaras;
    }
}
