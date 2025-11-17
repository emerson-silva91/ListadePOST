package br.unipar.devbackend.listapost.controller;

import br.unipar.devbackend.listapost.DTO.LoginDTO;

import br.unipar.devbackend.listapost.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autenticar")
public class LoginController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/login")
    public String login(@RequestBody LoginDTO login) {

        var user = usuarioRepository.findAll()
                .stream()
                .filter(u -> u.getEmail().equals(login.getEmail()) &&
                        u.getSenha().equals(login.getSenha()))
                .findFirst();

        if (user.isPresent())
            return "Login autorizado!";

        return "Credenciais inválidas.";
    }
}
