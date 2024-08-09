package com.project.uber.uberApp.dto;

import com.project.uber.uberApp.entities.enums.PaymentMethod;
import com.project.uber.uberApp.entities.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDTO {

    private Long id;

    private PointDTO pickupLocation;
    private PointDTO dropLocation;
    private PaymentMethod paymentMethod;

    private LocalDateTime requestedTime;

    private Double fare;
    private RiderDTO rider;

    private RideRequestStatus rideRequestStatus;

}
