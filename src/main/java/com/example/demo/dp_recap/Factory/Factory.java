package com.example.demo.dp_recap.Factory;

public class Factory {
    public PachetTuristic crearePachet(TipPachet tipPachet) {
        switch (tipPachet) {
            case CAZARE:
                return new PachetTuristicCazare();
            case CAZARE_TRANSPORT:
                return new PachetTursiticCazareTransport();
            case TRANSPORT:
                return new PachetTuristicTransport();
            default:
                throw new RuntimeException("nu exista tipul de pachet!");
        }
    }
}
