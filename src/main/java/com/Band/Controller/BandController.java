package com.Band.Controller;

import com.Band.Model.Band;
import com.Band.Service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BandController {
    @Autowired
    BandService bandService;

    @GetMapping(value = "hello")
    public String getHello(){
        return "Hiya!";
    }

    @PostMapping(value = "/post")
    public void saveBand(@RequestBody Band band){
        bandService.saveBand(band);
    }

    @GetMapping(value = "/get/{id}")
    public Optional<Band> getBand(@PathVariable Long id){
        return bandService.getBand(id);
    }
    @GetMapping(value = "getall")
    public List<Band> getBands(){
        return bandService.getBands();
    }
    @PutMapping(value = "{id}")
    public void updateBand(@PathVariable Long id, @RequestBody Band bandToUpdate){
        bandService.updateBand(id,bandToUpdate);
    }
    @DeleteMapping(value = "delete/{id}")
    public void deleteBand(@PathVariable Long id){
        bandService.deleteBand(id);
    }
    @DeleteMapping(value = "deleteall")
    public void deleteAll(){
        bandService.deleteAll();
    }

}


