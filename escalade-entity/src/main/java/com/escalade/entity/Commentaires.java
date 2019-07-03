package com.escalade.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="commentaires")
public class Commentaires implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCommentaire;

    @Column(name = "date")
    private String date;

    @Column(name = "heure")
    private String hour;

    @Column(name = "taille")
    private String size;


    public Commentaires() {
    }

    public Integer getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(Integer idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getTaille() {
        return size;
    }

    public void setTaille(String taille) {
        this.size = size;
    }
}



