package com.desafio.votacao.associado;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class CPF {
    @Column(name = "cpf")
    private String numero;
}
