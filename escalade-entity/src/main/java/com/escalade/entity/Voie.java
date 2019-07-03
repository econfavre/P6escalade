package com.escalade.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="voie")
public class Voie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idVoie;

    @Column(name = "nom_voie")
    private String nameVoie;

    @Column(name = "taille_longueur")
    private Integer lenghtSize;

    public Voie() {
    }

    public Integer getIdVoie() {
        return idVoie;
    }

    public void setIdVoie(Integer idVoie) {
        this.idVoie = idVoie;
    }

    public String getNameVoie() {
        return nameVoie;
    }

    public void setNameVoie(String nameVoie) {
        this.nameVoie = nameVoie;
    }

    public Integer getLenghtSize() {
        return lenghtSize;
    }

    public void setLenghtSize(Integer lenghtSize) {
        this.lenghtSize = lenghtSize;
    }
}
