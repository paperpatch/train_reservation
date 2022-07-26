package com.company.trainreservation.repository;

import com.company.trainreservation.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Integer> {
}
