package br.com.triersistemas.banco.domain;

import br.com.triersistemas.banco.Enuns.StatusConta;

import java.math.BigDecimal;
import java.util.UUID;

public class ContaBanco {

    private UUID id;
    private int numConta;
    protected String tipo;
    private BigDecimal saldo;
    private StatusConta statusConta;
    private boolean status;
    private int agencia;
    private int depositar;

    public int getAgencia() {
        return agencia;
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

    public int getDepositar() {
        return depositar;
    }

    public ContaBanco() {
        this.id = UUID.randomUUID();
        this.saldo = BigDecimal.ZERO;
        this.statusConta = StatusConta.FECHADA;
        this.status = false;
    }


    public void abrirConta(String t) {
        if (this.status = false) {
            this.tipo = t;
            this.status = true;
            this.statusConta=StatusConta.ABERTA;
        }

    }

    public void fechaConta() {
        if (this.status == true) {
            this.status = false;
            this.statusConta=StatusConta.FECHADA;

        }
    }

    public void depositar(BigDecimal v) {
        if (this.status == true) {
            saldo = (this.getSaldo().add(v));
        }
    }

    public void sacar(BigDecimal v) {
        if (this.status == true && this.getSaldo().compareTo(BigDecimal.ZERO) >= 0) {
            saldo = (this.getSaldo().subtract(v));
        }
    }

}

