package com.Band.Model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Band {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "band")
    private List<Song> songs;

    public Band(){

    }
    public List<Song> getSongs(){
        return songs;
    }
    public void setSongs(List<Song> songs){
        this.songs = songs;
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
