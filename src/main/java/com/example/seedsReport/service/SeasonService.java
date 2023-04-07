package com.example.seedsReport.service;

import com.example.seedsReport.model.SeasonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.seedsReport.repository.SeasonRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeasonService {
    @Autowired
    SeasonRepository seasonRepository;
    public SeasonModel saveSeason(SeasonModel seasonModel){
        return new SeasonModel(seasonRepository.save(seasonModel.dissamble()));
    }
    public List<SeasonModel> getSeason(){
        return seasonRepository.findAll().stream().map(SeasonModel::new).collect(Collectors.toList());
    }
}
