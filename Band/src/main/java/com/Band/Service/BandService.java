package com.Band.Service;


import com.Band.Model.Band;
import com.Band.Repo.BandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BandService {
    @Autowired
    BandRepo bandRepo;

    public void saveBand(Band band) {
        bandRepo.save(band);
    }


    public Optional<Band> getBand(Long id){
         return bandRepo.findById(id);
    }

    public void updateBand(Long id, Band bandToUpdate) {
             bandRepo.findById(id)
                    .map(b ->{b.setName(bandToUpdate.getName());
                    return bandRepo.save(b);
                    });

    }

    public void deleteBand(Long id) {
        bandRepo.deleteById(id);
    }

    public List<Band> getBands() {
       return (List<Band>) bandRepo.findAll();
    }

    public void deleteAll() {
        bandRepo.deleteAll();
    }
}
