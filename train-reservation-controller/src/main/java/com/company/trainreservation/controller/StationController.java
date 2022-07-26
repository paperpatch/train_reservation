package com.company.trainreservation.controller;

import com.company.trainreservation.model.Station;
import com.company.trainreservation.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StationController {

    @Autowired
    StationService stationService;

    @GetMapping("/stations")
    public List<Station> getAllStation() {
        return stationService.getAllStation();
    }

    @GetMapping("/stations/{id}")
    public Station getStationById(@PathVariable int id) {
        return stationService.getStationById(id);
    }

    @PostMapping("/stations")
    public Station addNewStation(@RequestBody Station newStation) {
        return stationService.createStation(newStation);
    }

    @PutMapping("/stations")
    public void updateStation(@RequestBody Station station) {
        stationService.updateStation(station);
    }

    @DeleteMapping("/stations/{id}")
    public void deleteStation(@PathVariable int id) {
        stationService.deleteStation(id);

    }
}
