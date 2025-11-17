package br.unipar.devbackend.listapost.repository;

import br.unipar.devbackend.listapost.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface NotaRepository extends JpaRepository<Nota, Long> {
}
