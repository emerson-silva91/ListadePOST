package br.unipar.devbackend.listapost.repository;

import br.unipar.devbackend.listapost.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Long> {
}
