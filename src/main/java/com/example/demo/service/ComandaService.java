package com.example.demo.service;

import com.example.demo.dto.ComandaDTO;
import com.example.demo.model.Comanda;
import com.example.demo.model.Stare;
import com.example.demo.repository.ComandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComandaService {
    @Autowired
    private ComandaRepository repository;

    public void addComanda(ComandaDTO dto) {
        Comanda comanda = new Comanda();
        comanda.setStare(dto.getStare());
        comanda.setSuma(dto.getSuma());

        repository.save(comanda);
    }

    public ComandaDTO getComandaById(Long id) {
        return new ComandaDTO(
                repository.findById(id).orElseThrow(() -> new RuntimeException("Comanda nu exista"))
        );
    }

    public List<ComandaDTO> getAllComenzi() {
        return repository.findAll().stream()
                .map(ComandaDTO::new)
                .toList();
    }

    // Return entity list for views that need IDs
    public List<Comanda> getAllComenziEntities() {
        return repository.findAll();
    }

    public void deleteComanda(Long id) {
        repository.deleteById(id);
    }

    // Update an existing Comanda identified by id using values from the DTO
    public void editComanda(Long id, ComandaDTO dto) {
        Comanda comanda = repository.findById(id).orElseThrow(() -> new RuntimeException("Comanda nu exista"));
        comanda.setSuma(dto.getSuma());
        comanda.setStare(dto.getStare());
        repository.save(comanda);
    }

    public void nextStare(Long id) {
        Comanda comanda = repository.findById(id).orElseThrow(() -> new RuntimeException("nu exista"));

        switch (comanda.getStare()) {
            case PLASATA:
                comanda.setStare(Stare.PROCESATA);
                break;
            case PROCESATA:
                comanda.setStare(Stare.EXPEDIATA);
                break;
            case EXPEDIATA:
                comanda.setStare(Stare.LIVRATA);
                break;
            default:
                throw new RuntimeException("Comanda a fost deja livrata!");
        }

        repository.save(comanda);
    }
}
