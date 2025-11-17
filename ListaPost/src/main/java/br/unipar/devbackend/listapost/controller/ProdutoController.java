package br.unipar.devbackend.listapost.controller;

import br.unipar.devbackend.listapost.model.Produto;
import br.unipar.devbackend.listapost.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
}
