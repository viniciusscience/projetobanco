package br.com.triersistemas.banco.model;

import br.com.triersistemas.banco.domain.Cliente;
import lombok.Getter;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Getter
public class ContaBancoModel {
    private UUID id;
    private String tipo;
    private UUID idCliente;
    private int agencia;

}
