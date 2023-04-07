package com.example.seedsReport.model;

import com.example.seedsReport.entity.Crop;
import com.example.seedsReport.entity.Seed;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class SeedModel
{
    private Long seedId;

    private String seedName;

    private double soilPh;
    private double soilNutrientLevel;

    private double waterNutrientLevel;

    private double waterPH;

    private CropModel cropModel;
    public Seed dissamble(){
        Seed seed=new Seed();
        seed.setSeedId(this.seedId);
        seed.setSeedName(this.seedName);
        seed.setSoilPh(this.soilPh);
        seed.setSoilNutrientLevel(this.soilNutrientLevel);
        seed.setWaterNutrientLevel(this.waterNutrientLevel);
        seed.setWaterPH(this.waterPH);
        seed.setCrop(this.cropModel.dissamble());
        return  seed;
    }
}
