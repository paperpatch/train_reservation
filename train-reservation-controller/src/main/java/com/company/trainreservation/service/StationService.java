package com.company.trainreservation.service;

import com.company.trainreservation.model.Station;
import com.company.trainreservation.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StationService {
    @Autowired
    StationRepository repo;

    public List<Station> getAllStation() {
        return repo.findAll();
    }

    public Station createStation(Station newStation) {
        repo.save(newStation);
        return newStation;
    }

    public Station getStationById(int id) {
        Optional<Station> station = repo.findById(id);
        return station.orElse(null);
    }

    public void updateStation(Station station) {
        repo.save(station);
    }

    public void deleteStation(int id) {
        Optional<Station> station = repo.findById(id);
        station.ifPresent(value -> repo.delete(value));
    }
}
