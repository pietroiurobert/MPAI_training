package com.example.demo.dto;

import com.example.demo.model.Comanda;
import com.example.demo.model.Stare;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ComandaDTO {
    // contine in cazul asta tot in afara de ID.
    // deci se poate utiliza si la edit comanda, fiindca nu vrem ca user-ul sa editeze ID-ul comenzii
    private double suma;
    private Stare stare;

    public ComandaDTO(Comanda comanda) {
        this.suma = comanda.getSuma();
        this.stare = comanda.getStare();
    }
}
