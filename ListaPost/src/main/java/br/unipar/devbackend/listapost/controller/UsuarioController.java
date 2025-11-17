package br.unipar.devbackend.listapost.controller;

import br.unipar.devbackend.listapost.model.Usuario;
import br.unipar.devbackend.listapost.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
