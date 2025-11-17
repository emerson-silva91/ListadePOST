package br.unipar.devbackend.listapost.controller;

import br.unipar.devbackend.listapost.model.Curtida;
import br.unipar.devbackend.listapost.repository.CurtidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curtida")
public class CurtidaController {

    @Autowired
    private CurtidaRepository  curtidaRepository;

    @PostMapping
    public Curtida registrar(@RequestBody Curtida curtida){
        return curtidaRepository.save(curtida);
    }
}
