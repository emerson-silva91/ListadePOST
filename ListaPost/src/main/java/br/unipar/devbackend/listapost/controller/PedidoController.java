package br.unipar.devbackend.listapost.controller;

import br.unipar.devbackend.listapost.model.Pedido;
import br.unipar.devbackend.listapost.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoRepository pedidoRepository;

    @PostMapping
    public Pedido adcionar(@RequestBody Pedido pedido){
        return pedidoRepository.save(pedido);
    }
}
