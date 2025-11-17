package br.unipar.devbackend.listapost.controller;

import br.unipar.devbackend.listapost.model.Matricula;
import br.unipar.devbackend.listapost.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @PostMapping
    public Matricula registrar(@RequestBody Matricula matricula) {
        return matriculaRepository.save(matricula);
    }
}
