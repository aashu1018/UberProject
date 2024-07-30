package com.project.uber.uberApp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;


@Entity
@Getter
@Setter
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double rating;

    private Boolean available;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    Point currentLocation;
}
