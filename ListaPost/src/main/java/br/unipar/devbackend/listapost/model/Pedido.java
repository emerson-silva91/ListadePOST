package br.unipar.devbackend.listapost.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valorTotal;

    @ElementCollection
    private List<Long> produtoIds;
}
