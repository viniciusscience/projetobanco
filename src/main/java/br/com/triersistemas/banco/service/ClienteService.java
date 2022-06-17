package br.com.triersistemas.banco.service;

import br.com.triersistemas.banco.domain.Cliente;
import br.com.triersistemas.banco.model.ClienteModel;

import java.util.List;
import java.util.UUID;

public interface ClienteService {

    List<Cliente> consultar();

    Cliente consultar(UUID id);

    Cliente cadastrar(ClienteModel model);

    Cliente alterar(UUID id, ClienteModel model);

    Cliente remover(UUID id);
}
