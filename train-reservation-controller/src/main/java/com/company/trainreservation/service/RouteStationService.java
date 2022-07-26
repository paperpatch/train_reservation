package com.company.trainreservation.service;

import com.company.trainreservation.model.RouteStation;
import com.company.trainreservation.repository.RouteStationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RouteStationService {

    @Autowired
    RouteStationRepository repo;

    public List<RouteStation> getAllRouteStation() {
        return repo.findAll();
    }

    public RouteStation createRouteStation(RouteStation newRouteStation) {
        repo.save(newRouteStation);
        return newRouteStation;
    }

    public RouteStation getRouteStationById(int id) {
        Optional<RouteStation> routeStation = repo.findById(id);
        return routeStation.orElse(null);
    }

    public void updateRouteStation(RouteStation routeStation) {
        repo.save(routeStation);
    }

    public void deleteRouteStation(int id) {
        Optional<RouteStation> routeStation = repo.findById(id);
        routeStation.ifPresent(value -> repo.delete(value));
    }
}
