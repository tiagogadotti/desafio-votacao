package com.desafio.votacao.votacao;

import com.desafio.votacao.pauta.Pauta;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Votacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pauta pauta;

    private LocalDateTime inicio;

    private Integer minutosDuracao;


}
