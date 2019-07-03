package com.escalade.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="secteur")
public class Secteur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idSecteur;

    @Column(name = "nom_secteur")
    private String nameSecteur;


    public Secteur() {
    }

    public Integer getIdSecteur() {
        return idSecteur;
    }

    public void setIdSecteur(Integer idSecteur) {
        this.idSecteur = idSecteur;
    }

    public String getNameSecteur() {
        return nameSecteur;
    }

    public void setNameSecteur(String nameSecteur) {
        this.nameSecteur = nameSecteur;
    }
}
