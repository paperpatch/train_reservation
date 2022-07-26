package com.company.trainreservation.controller;

import com.company.trainreservation.model.Train;
import com.company.trainreservation.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrainController {

    @Autowired
    TrainService trainService;

    @GetMapping("/trains")
    public List<Train> getAllTrain() {
        return trainService.getAllTrain();
    }

    @GetMapping("/trains/{id}")
    public Train getTrainById(@PathVariable int id) {
        return trainService.getTrainById(id);
    }

    @PostMapping("/trains")
    public Train addNewTrain(@RequestBody Train newTrain) {
        return trainService.createTrain(newTrain);
    }

    @PutMapping("/trains")
    public void updateTrain(@RequestBody Train train) {
        trainService.updateTrain(train);
    }

    @DeleteMapping("/trains/{id}")
    public void deleteTrain(@PathVariable int id) {
        trainService.deleteTrain(id);

    }
}
