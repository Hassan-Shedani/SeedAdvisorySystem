package com.example.seedsReport.controller;

import com.example.seedsReport.entity.Seed;
import com.example.seedsReport.model.AdvisoryModel;
import com.example.seedsReport.model.SeedModel;
import com.example.seedsReport.service.SeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.seedsReport.repository.SeedRepository;

@RestController
@RequestMapping("/seed")
public class SeedController {
    @Autowired
    SeedService seedService;

    @GetMapping("/seedName")
    public String getSeedName(@RequestBody AdvisoryModel advisoryModel){
        return seedService.getSeedName(advisoryModel);
    }
    @PostMapping("/save")
    public SeedModel save(@RequestBody SeedModel seedModel){
        return  seedService.saveSeed(seedModel);
    }
}
