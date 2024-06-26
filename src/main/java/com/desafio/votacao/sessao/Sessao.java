package com.desafio.votacao.sessao;

import com.desafio.votacao.pauta.Pauta;
import com.desafio.votacao.voto.Voto;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Sessao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pauta pauta;

    private LocalDateTime inicio;

    private Integer minutosDuracao;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Voto> votos;

}
