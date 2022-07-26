package com.company.trainreservation.repository;

import com.company.trainreservation.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Integer> {
}
