package com.example.seedsReport.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdvisoryModel {
    private double soilPh;
    private double soilNutrientLevel;
    private double waterNutrientLevel;
    private double waterPh;
    private String cropName;
}
