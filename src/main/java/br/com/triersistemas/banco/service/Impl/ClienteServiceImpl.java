package br.com.triersistemas.banco.service.Impl;

import br.com.triersistemas.banco.domain.Cliente;
import br.com.triersistemas.banco.exceptions.NaoExisteException;
import br.com.triersistemas.banco.model.ClienteModel;
import br.com.triersistemas.banco.repository.ClienteRepository;
import br.com.triersistemas.banco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public List<Cliente> consultar() {
        return clienteRepository.consultar();
    }

    @Override
    public Cliente consultar(UUID id) {
        return clienteRepository.consultar(id).orElseThrow(NaoExisteException::new);
    }

    @Override
    public Cliente cadastrar(ClienteModel model) {
        Cliente cliente = new Cliente(model.getNome(), model.getCpf());
        clienteRepository.cadastrar(cliente);
        return cliente;

    }

    @Override
    public Cliente alterar(UUID id, ClienteModel model) {
        Cliente cliente = this.consultar(id);
        cliente.alterar(model.getNome(), model.getCpf());
        return cliente;
    }

    @Override
    public Cliente remover(UUID id) {
        Cliente cliente = this.consultar(id);
        clienteRepository.remover(cliente);
        return cliente;
    }
}
