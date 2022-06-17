package br.com.triersistemas.banco.domain;

import br.com.triersistemas.banco.Enuns.StatusConta;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class ContaBanco {

    private UUID id;
    private Cliente cliente;
    private int numConta;
    protected String tipo;
    private BigDecimal saldo;
    private StatusConta statusConta;
    private BigDecimal valor;
    private boolean status;
    private int agencia;
    private LocalDateTime data;
    private int senha;

    public int getSenha() {return senha;}

    public int getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public StatusConta getStatus() {
        return statusConta;
    }

    public UUID getId() {return id;}

    public ContaBanco(Cliente cliente, String tipo, int agencia) {
        Random gerador = new Random();
        this.id = UUID.randomUUID();
        this.cliente = cliente;
        this.statusConta = StatusConta.ABERTA;
        this.saldo = BigDecimal.ZERO;
        this.tipo = tipo;
        this.agencia = agencia;
        this.data = LocalDateTime.now();
        this.status = true;
        this.numConta=gerador.nextInt(0,100);
        this.senha= gerador.nextInt(1000,2000);

    }

    public void fechaConta() {
        if (this.status == true) {
            this.status = false;
            this.statusConta = StatusConta.FECHADA;

        }
    }

    public ContaBanco depositar(BigDecimal v) {
        if (this.status == true) {
            this.saldo = valor;
        }
        return this;
    }

    public ContaBanco sacar(BigDecimal v) {
        if (this.status == true && this.getSaldo().compareTo(BigDecimal.ZERO) >= 0) {
            this.saldo = saldo.subtract(valor);
        }
        return this;
    }

}

