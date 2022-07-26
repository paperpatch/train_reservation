package com.company.trainreservation.service;

import com.company.trainreservation.model.Route;
import com.company.trainreservation.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RouteService {
    @Autowired
    RouteRepository repo;

    public List<Route> getAllRoute() {
        return repo.findAll();
    }

    public Route createRoute(Route newRoute) {
        repo.save(newRoute);
        return newRoute;
    }

    public Route getRouteById(int id) {
        Optional<Route> route = repo.findById(id);
        return route.orElse(null);
    }

    public void updateRoute(Route route) {
        repo.save(route);
    }

    public void deleteRoute(int id) {
        Optional<Route> route = repo.findById(id);
        route.ifPresent(value -> repo.delete(value));
    }
}
