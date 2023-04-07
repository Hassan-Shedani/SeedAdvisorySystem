package com.example.seedsReport.service;

import com.example.seedsReport.entity.Season;
import com.example.seedsReport.entity.Seed;
import com.example.seedsReport.model.AdvisoryModel;
import com.example.seedsReport.model.SeedModel;
import com.example.seedsReport.repository.SeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeedService {
    @Autowired
    SeedRepository seedRepository;
    public String getSeedName(AdvisoryModel advisoryModel){
        Seed seed=seedRepository.findSeedBySoilPhAndSoilNutrientLevelAndWaterPhAndWaterNutrientLevelAndCrop_Name(advisoryModel.getSoilPh(),advisoryModel.getSoilNutrientLevel(),advisoryModel.getWaterPh(),advisoryModel.getWaterNutrientLevel(),advisoryModel.getCropName());
        if(seed!=null){
            return seed.getSeedName();
        }else{
            return "Not seed available corresponding your request";
        }
    }
    public SeedModel saveSeed(SeedModel seedModel){
        Seed seed=seedRepository.save(seedModel.dissamble());
        return new SeedModel(seed);
    }
}
