package br.unipar.devbackend.listapost.controller;

import br.unipar.devbackend.listapost.model.Nota;
import br.unipar.devbackend.listapost.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notas")
public class NotaController {

    @Autowired
    private NotaRepository notaRepository;

    @PostMapping
    public Nota salvar(@RequestBody Nota nota){
        return notaRepository.save(nota);
    }
}
