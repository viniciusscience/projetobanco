package br.com.triersistemas.banco.domain;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Cliente {

    private UUID id;
    private String nome;
    private String cpf;

    public Cliente(final String nome, final String cpf) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
    }

    public void alterar(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
