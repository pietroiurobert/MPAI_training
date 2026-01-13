package com.example.demo.repository;

import com.example.demo.model.Comanda;
import com.example.demo.model.Stare;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ComandaRepository extends JpaRepository<Comanda, Long> {
}
