package com.project.uber.uberApp.dto;

import com.project.uber.uberApp.entities.Driver;
import com.project.uber.uberApp.entities.Rider;
import com.project.uber.uberApp.entities.enums.PaymentMethod;
import com.project.uber.uberApp.entities.enums.RideRequestStatus;
import com.project.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDTO {

    private Long id;
    private Point pickupLocation;
    private Point dropLocation;
    private LocalDateTime createdTime;
    private Rider rider;
    private Driver driver;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}
