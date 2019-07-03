package com.escalade.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="site")
public class Site implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idSite;

    @Column(name = "nom_site")
    private String nameSite;


    public Site() {
    }

    public Integer getIdSite() {
        return idSite;
    }

    public void setIdSite(Integer idSite) {
        this.idSite = idSite;
    }

    public String getNameSite() {
        return nameSite;
    }

    public void setNameSite(String nameSite) {
        this.nameSite = nameSite;
    }
}

