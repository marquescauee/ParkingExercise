package com.clm.parkingcontrolexercise.repositories;

import com.clm.parkingcontrolexercise.models.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ICarRepository extends JpaRepository<CarModel, UUID> {
}
