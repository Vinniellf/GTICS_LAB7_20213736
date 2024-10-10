package com.example.tarea.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "movieprojections")
public class Movieprojection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "projectionDate", nullable = false)
    private Instant projectionDate;

    @Column(name = "availableSeats")
    private Integer availableSeats;

}