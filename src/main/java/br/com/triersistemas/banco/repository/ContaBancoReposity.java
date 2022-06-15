package br.com.triersistemas.banco.repository;

import br.com.triersistemas.banco.domain.ContaBanco;

import java.util.List;

public interface ContaBancoReposity {

    List<ContaBanco>  consultar();
    void cadastrar(ContaBanco contaBanco);
    void remover (ContaBanco contaBanco);
}
