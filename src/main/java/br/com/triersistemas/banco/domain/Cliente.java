package br.com.triersistemas.banco.domain;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Cliente {

    private UUID id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String endereco;


    public Cliente(final String nome, final String cpf, String email, String telefone, LocalDate dataNascimento, String endereco) {
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
    }


    public void alterar(String nome, String cpf, String email, String telefone, LocalDate dataNascimento, String endereco) {
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.nome = nome;
        this.cpf = cpf;
    }
}
