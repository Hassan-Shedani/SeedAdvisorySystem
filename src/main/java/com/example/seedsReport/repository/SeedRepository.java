package com.example.seedsReport.repository;

import com.example.seedsReport.entity.Seed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeedRepository extends JpaRepository <Seed, Long>{
}
