package com.escalade.entity;

import javax.persistence.*;
import java.io.Serializable;

    @Entity
    @Table(name="reservation")
    public class Reservation implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer idReservation;

        public Reservation() {
        }

        public Integer getIdReservation() {
            return idReservation;
        }

        public void setIdReservation(Integer id) {
            this.idReservation= idReservation;
        }
    }
