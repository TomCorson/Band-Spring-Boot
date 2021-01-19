package com.Band.Model;

import javax.persistence.*;

@Entity
public class Song {

        @Id
        private Long id;
        private String name;
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "band_id")
        private Band band;

        public Song(){

        }

        public Band getBand(){
            return band;
        }
        public void setBand(Band band){
            this.band = band;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public Long getId() {
            return id;
        }
        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
    }

