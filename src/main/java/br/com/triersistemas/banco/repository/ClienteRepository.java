package br.com.triersistemas.banco.repository;

import br.com.triersistemas.banco.domain.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClienteRepository {

    List<Cliente> consultar();

    Optional<Cliente> consultar(UUID id);

    void cadastrar(Cliente cliente);

    void remover(Cliente cliente);
}
