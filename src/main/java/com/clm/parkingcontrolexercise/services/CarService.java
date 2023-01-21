package com.clm.parkingcontrolexercise.services;

import com.clm.parkingcontrolexercise.models.CarModel;
import com.clm.parkingcontrolexercise.repositories.ICarRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CarService implements ICarService{

    private final ICarRepository carRepository;

    public CarService(ICarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public CarModel save(CarModel carModel) {
        return carRepository.save(carModel);
    }

    @Override
    public CarModel findById(UUID idCar) {
        return carRepository.findById(idCar).get();
    }

}
