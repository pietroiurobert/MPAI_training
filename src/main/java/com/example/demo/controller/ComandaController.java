package com.example.demo.controller;

import com.example.demo.dto.ComandaDTO;
import com.example.demo.model.Comanda;
import com.example.demo.model.Stare;
import com.example.demo.service.ComandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ComandaController {
    @Autowired
    ComandaService service;

    @GetMapping("/comenzi")
    public String getComenzi(Model model) {
        // use entity list for the table so templates can access id
        List<Comanda> comandaList = service.getAllComenziEntities();
        model.addAttribute("comenzi", comandaList);

        // provide an empty DTO to bind the create form (DTO doesn't contain id)
        model.addAttribute("comanda", new ComandaDTO());
        model.addAttribute("stari", Stare.values());

        return "comenzi/comenzi";
    }

    @PostMapping("/comenzi/save")
    public String saveComanda(@ModelAttribute("comanda") ComandaDTO comanda) {
        service.addComanda(comanda);
        return "redirect:/comenzi";
    }

    @PostMapping("comenzi/delete/{id}")
    public String deleteComanda(@PathVariable Long id) {
        service.deleteComanda(id);
        return "redirect:/comenzi";
    }

    @GetMapping("/comenzi/editForm/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        ComandaDTO comanda = service.getComandaById(id);
        model.addAttribute("comanda", comanda);
        model.addAttribute("stari", Stare.values());
        // provide id separately because DTO intentionally has no id
        model.addAttribute("comandaId", id);
        return "comenzi/editForm";
    }

    @PostMapping("/comenzi/edit")
    public String editComanda(@ModelAttribute ComandaDTO dto, @RequestParam Long id) {
        service.editComanda(id, dto);
        return "redirect:/comenzi";
    }

    @PostMapping("comenzi/nextStare")
    public String nextStareComanda(@RequestParam Long id) {
        service.nextStare(id);
        return "redirect:/comenzi";
    }
}
