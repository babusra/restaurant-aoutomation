package com.example.restaurantaoutomation.controllers;

import com.example.restaurantaoutomation.model.Firm;
import com.example.restaurantaoutomation.repositories.FirmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirmController {
    @Autowired
    private FirmRepository firmRepository;

    @GetMapping("/api/firm/getAll")
    public Iterable<Firm> getAll(@RequestParam String filter){
        return firmRepository.findAllByFirmNameContaining(filter);
    }

    @PostMapping("/api/firm/saveFirm")
    public int saveFirm(@RequestBody Firm firm){
        firmRepository.save(firm);
        return saveFirm(firm);
    }

}
