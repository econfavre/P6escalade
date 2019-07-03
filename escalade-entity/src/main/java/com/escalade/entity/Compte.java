package com.escalade.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="compte")
public class Compte implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nom")
    private String firstname;

    @Column(name = "prenom")
    private String surname;

    @Column(name = "pseudo")
    private String pseudo;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String pass;

    @Column(name = "role")
    private String role;

    public Compte() {
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
