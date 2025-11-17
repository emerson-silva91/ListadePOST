package br.unipar.devbackend.listapost.controller;

import br.unipar.devbackend.listapost.model.Comentario;
import br.unipar.devbackend.listapost.repository.ComentarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @PostMapping
    public Comentario enviar(@RequestBody Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

}
