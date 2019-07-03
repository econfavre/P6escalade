package com.escalade.entity;

import javax.persistence.*;
import java.io.Serializable;


    @Entity
    @Table(name="topo")
    public class Topo implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer idTopo;

        @Column(name = "nom_topo")
       private String nameTopo;

        public Topo(String nameTopo) {
            this.nameTopo = nameTopo;
        }

        public Integer getIdTopo() {
            return idTopo;
        }

        public void setIdTopo(Integer idTopo) {
            this.idTopo = idTopo;
        }

        public String getNameTopo() {
            return nameTopo;
        }

        public void setNameTopo(String nameTopo) {
            this.nameTopo = nameTopo;
        }
    }

