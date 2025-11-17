package br.unipar.devbackend.listapost.repository;

import br.unipar.devbackend.listapost.model.Curtida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurtidaRepository extends JpaRepository<Curtida, Long> {
}
