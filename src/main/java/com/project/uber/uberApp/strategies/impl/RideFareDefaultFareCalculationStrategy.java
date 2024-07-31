package com.project.uber.uberApp.strategies.impl;

import com.project.uber.uberApp.dto.RideRequestDTO;
import com.project.uber.uberApp.strategies.RideFarceCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareDefaultFareCalculationStrategy implements RideFarceCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDTO rideRequestDTO) {
        return 0;
    }
}
