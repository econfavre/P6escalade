package com.escalade.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="site")
public class Cotation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCotation;

    @Column(name = "nom_cotation")
    private String nameCotation;

    @Column(name = "difficulte")
    private String difficulty;


    public Cotation() {
    }

    public Integer getIdCotation() {
        return idCotation;
    }

    public void setIdCotation(Integer idCotation) {
        this.idCotation = idCotation;
    }

    public String getNameCotation() {
        return nameCotation;
    }

    public void setNameCotation(String nameCotation) {
        this.nameCotation = nameCotation;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
