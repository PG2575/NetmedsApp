package com.netmeds.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;








    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name ="Druggists")
    public class Medicines {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private String name;
        private long price;
        private String application;

    }










