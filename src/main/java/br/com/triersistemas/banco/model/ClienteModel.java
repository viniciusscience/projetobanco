package br.com.triersistemas.banco.model;

import lombok.Getter;
import lombok.NonNull;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Getter
public class ClienteModel {

    private UUID id;

    private String nome;

    @Length(min = (1), max = (11))
    private String cpf;
}
