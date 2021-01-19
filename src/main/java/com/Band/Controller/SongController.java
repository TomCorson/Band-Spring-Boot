package com.Band.Controller;

import com.Band.Model.Band;
import com.Band.Model.Song;
import com.Band.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/song")
public class SongController {
    @Autowired
    SongService songService;

    @PostMapping(value = "/post")
    public void saveSong(@RequestBody Song song){
        songService.saveSong(song);
    }
    @GetMapping(value = "/get/{id}")
    public Song getSong(@PathVariable Long id){
        return songService.getSong(id);
    }
    @GetMapping(value = "getall")
    public List<Song> getSongs(){
        return songService.getSongs();
    }
}
