package com.company.trainreservation.controller;

import com.company.trainreservation.model.RouteStation;
import com.company.trainreservation.service.RouteStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RouteStationController {

    @Autowired
    RouteStationService routeStationService;

    @GetMapping("/routeStation")
    public List<RouteStation> getAllRouteStation() {
        return routeStationService.getAllRouteStation();
    }

    @GetMapping("/routeStation/{id}")
    public RouteStation getRouteStationById(@PathVariable int id) {
        return routeStationService.getRouteStationById(id);
    }

    @PostMapping("/routeStation")
    public RouteStation addNewRouteStation(@RequestBody RouteStation newRouteStation) {
        return routeStationService.createRouteStation(newRouteStation);
    }

    @PutMapping("/routeStation")
    public void updateRouteStation(@RequestBody RouteStation customer) {
        routeStationService.updateRouteStation(customer);
    }

    @DeleteMapping("/routeStation/{id}")
    public void deleteRouteStation(@PathVariable int id) {
        routeStationService.deleteRouteStation(id);

    }
}
