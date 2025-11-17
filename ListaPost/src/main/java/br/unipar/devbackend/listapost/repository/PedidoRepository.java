package br.unipar.devbackend.listapost.repository;

import br.unipar.devbackend.listapost.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository  extends JpaRepository<Pedido,Long> {
}
