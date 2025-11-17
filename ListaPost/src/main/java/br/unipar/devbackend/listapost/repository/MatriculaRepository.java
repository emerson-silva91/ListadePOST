package br.unipar.devbackend.listapost.repository;

import br.unipar.devbackend.listapost.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
