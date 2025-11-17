package br.unipar.devbackend.listapost.controller;

import br.unipar.devbackend.listapost.model.ItemCarrinho;
import br.unipar.devbackend.listapost.repository.ItemCarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carrinho")
public class ItemCarrinhoController {

    @Autowired
    private ItemCarrinhoRepository itemCarrinhoRepository;

    @PostMapping
    public ItemCarrinho adicionar(@RequestBody ItemCarrinho item){
        return itemCarrinhoRepository.save(item);
    }
}
