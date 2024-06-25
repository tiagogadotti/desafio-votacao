package com.desafio.votacao.associado;

import com.desafio.votacao.voto.Voto;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Associado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Embedded
    private CPF cpf;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Voto> votos;
}

