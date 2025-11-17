package br.unipar.devbackend.listapost.repository;

import br.unipar.devbackend.listapost.model.ItemCarrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ItemCarrinhoRepository extends JpaRepository<ItemCarrinho, Long> {

}
