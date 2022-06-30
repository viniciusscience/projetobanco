package br.com.triersistemas.banco.model;

import br.com.triersistemas.banco.Enuns.StatusConta;
import br.com.triersistemas.banco.domain.Cliente;
import lombok.Getter;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class ContaBancoModel {

    private UUID idCliente;
    private int numConta;
    protected String tipo;
    private BigDecimal saldo;
    private StatusConta statusConta;
    private BigDecimal valor;
    private boolean status;
    private int agencia;
    private int senha;



}
