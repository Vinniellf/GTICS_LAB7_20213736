package com.example.tarea.Entities;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import lombok.Cleanup;

@Entity
@Table(name = "usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idbase", nullable = false)
    private Integer id;

    @Column(name = "namebase", length = 20)
    private String name;

}
