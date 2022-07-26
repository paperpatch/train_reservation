package com.company.trainreservation.repository;

import com.company.trainreservation.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Integer> {
}
