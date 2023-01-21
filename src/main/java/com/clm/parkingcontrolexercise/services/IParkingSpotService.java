package com.clm.parkingcontrolexercise.services;

import com.clm.parkingcontrolexercise.models.ParkingSpotModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IParkingSpotService {
    ParkingSpotModel save(ParkingSpotModel parkingSpotModel);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);

    List<ParkingSpotModel> findAll();

    Optional<ParkingSpotModel> findById(UUID id);

    void delete(ParkingSpotModel parkingSpotModel);
}
