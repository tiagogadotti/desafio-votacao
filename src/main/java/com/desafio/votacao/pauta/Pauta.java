package com.desafio.votacao.pauta;

import com.desafio.votacao.voto.Voto;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pauta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 256)
    private String titulo;

    @Column(nullable = false)
    private String descricao;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Voto> votos;

}
