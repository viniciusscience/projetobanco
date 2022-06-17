package br.com.triersistemas.banco.service;

import br.com.triersistemas.banco.domain.Cliente;
import br.com.triersistemas.banco.domain.ContaBanco;
import br.com.triersistemas.banco.model.ClienteModel;
import br.com.triersistemas.banco.model.ContaBancoModel;
import br.com.triersistemas.banco.model.PagarContaModel;

import java.util.List;
import java.util.UUID;

public interface ContaBancoService {


    List<ContaBanco> consultar();

    ContaBanco consultar(UUID id);

    ContaBanco cadastrar(ContaBancoModel model);

    ContaBanco remover(UUID id);

    ContaBanco depositar(UUID id, PagarContaModel model);

    ContaBanco sacar(UUID id, PagarContaModel model);
}
