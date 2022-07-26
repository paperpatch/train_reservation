package com.company.trainreservation.controller;

import com.company.trainreservation.model.Route;
import com.company.trainreservation.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RouteController {

    @Autowired
    RouteService routeService;

    @GetMapping("/routes")
    public List<Route> getAllRoute() {
        return routeService.getAllRoute();
    }

    @GetMapping("/routes/{id}")
    public Route getRouteById(@PathVariable int id) {
        return routeService.getRouteById(id);
    }

    @PostMapping("/routes")
    public Route addNewRoute(@RequestBody Route newRoute) {
        return routeService.createRoute(newRoute);
    }

    @PutMapping("/routes")
    public void updateRoute(@RequestBody Route route) {
        routeService.updateRoute(route);
    }

    @DeleteMapping("/routes/{id}")
    public void deleteRoute(@PathVariable int id) {
        routeService.deleteRoute(id);

    }
}
