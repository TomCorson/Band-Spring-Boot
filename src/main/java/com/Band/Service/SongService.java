package com.Band.Service;

import com.Band.Model.Band;
import com.Band.Model.Song;
import com.Band.Repo.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {
    @Autowired
    SongRepo songRepo;

    public void saveSong(Song song) {
        songRepo.save(song);
    }

    public Song getSong(Long id) {
        return songRepo.findById(id).get();
    }

    public List<Song> getSongs() {
        return songRepo.findAll();
    }
}
