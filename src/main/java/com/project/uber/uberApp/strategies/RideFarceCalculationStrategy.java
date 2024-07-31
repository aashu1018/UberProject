package com.project.uber.uberApp.strategies;

import com.project.uber.uberApp.dto.RideRequestDTO;

public interface RideFarceCalculationStrategy {

    double calculateFare(RideRequestDTO rideRequestDTO);

}
