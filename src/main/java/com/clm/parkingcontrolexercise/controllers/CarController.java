package com.clm.parkingcontrolexercise.controllers;

import com.clm.parkingcontrolexercise.dtos.CarDto;
import com.clm.parkingcontrolexercise.dtos.ParkingSpotDto;
import com.clm.parkingcontrolexercise.models.CarModel;
import com.clm.parkingcontrolexercise.models.ParkingSpotModel;
import com.clm.parkingcontrolexercise.services.ICarService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@RequestMapping("/api/car")
public class CarController {

    private final ICarService carService;

    public CarController(ICarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<Object> saveCar(@RequestBody @Valid CarDto carDto) {
        CarModel carModel = new CarModel();

        BeanUtils.copyProperties(carDto, carModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(carService.save(carModel));
    }
}
