package com.example.seedsReport.service;

import com.example.seedsReport.entity.Season;
import com.example.seedsReport.entity.Seed;
import org.springframework.stereotype.Service;

@Service
public class SeedService {
    public Seed recommendSeed(Season season, Seed seed) {
        double waterPh = seed.getWaterPH();
        double waterNutrientLevel = seed.getWaterNutrientLevel();
        double soilPh = seed.getSoilPh();
        double soilNutrientLevel = seed.getSoilNutrientLevel();

        if (season.getName().equals("Spring")) {
            if (waterPh >= 6.5 && waterNutrientLevel >= 0.8 && soilPh >= 6.0 && soilNutrientLevel >= 0.6) {
                //  return new Seed("Carrots");
            } else if (waterPh >= 6.0 && waterNutrientLevel >= 0.7 && soilPh >= 6.0 && soilNutrientLevel >= 0.5) {
                //  return new Seed("Lettuce");
            }
        } else if (season.getName().equals("Summer")) {
            if (waterPh >= 6.5 && waterNutrientLevel >= 0.7 && soilPh >= 6.5 && soilNutrientLevel >= 0.5) {
                //  return new Seed("Tomatoes");
            } else if (waterPh >= 6.0 && waterNutrientLevel >= 0.6 && soilPh >= 6.0 && soilNutrientLevel >= 0.4) {
                //  return new Seed("Peppers");
            }
        } else if (season.getName().equals("Fall")) {
            if (waterPh >= 6.0 && waterNutrientLevel >= 0.6 && soilPh >= 6.0 && soilNutrientLevel >= 0.5) {
                // return new Seed("Broccoli");
            } else if (waterPh >= 6.0 && waterNutrientLevel >= 0.7 && soilPh >= 6.0 && soilNutrientLevel >= 0.5) {
                //  return new Seed("Cabbage");
            }
        } else if (season.getName().equals("Winter")) {
            if (waterPh >= 6.0 && waterNutrientLevel >= 0.6 && soilPh >= 6.0 && soilNutrientLevel >= 0.4) {
                //  return new Seed("Beets");
            } else if (waterPh >= 6.0 && waterNutrientLevel >= 0.7 && soilPh >= 6.0 && soilNutrientLevel >= 0.6) {
                //  return new Seed("Spinach");
            }
        }
        return null;
    }
}
