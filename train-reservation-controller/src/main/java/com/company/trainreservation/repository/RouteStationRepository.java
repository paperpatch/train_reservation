package com.company.trainreservation.repository;

import com.company.trainreservation.model.RouteStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteStationRepository extends JpaRepository<RouteStation, Integer> {
}
