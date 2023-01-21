package com.clm.parkingcontrolexercise.services;

import com.clm.parkingcontrolexercise.models.CarModel;

import java.util.UUID;

public interface ICarService {
    CarModel save(CarModel carModel);

    CarModel findById(UUID idCar);

}
