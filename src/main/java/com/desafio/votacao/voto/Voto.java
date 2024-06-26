package com.desafio.votacao.voto;

import com.desafio.votacao.associado.Associado;
import com.desafio.votacao.pauta.Pauta;
import com.fasterxml.jackson.databind.annotation.EnumNaming;
import jakarta.persistence.*;

@Entity
public class Voto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private VotoOpcao opcao;

    @ManyToOne
    private Associado associado;


}
