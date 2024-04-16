package it.engim.esempioesame.controller;

import it.engim.esempioesame.model.Fermata;
import it.engim.esempioesame.repository.FermataRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FermateController {

    @GetMapping("/fermate")
    public List<Fermata> getFermate(){
        return FermataRepository.getFermate();
    }
}
