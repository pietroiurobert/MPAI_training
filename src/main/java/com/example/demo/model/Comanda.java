package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Comanda {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Stare stare;
    private double suma;

    public Comanda(Stare stare, double suma) {
        this.stare = stare;
        this.suma = suma;
    }
}
