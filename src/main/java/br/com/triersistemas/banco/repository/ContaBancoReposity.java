package br.com.triersistemas.banco.repository;

import br.com.triersistemas.banco.domain.Cliente;
import br.com.triersistemas.banco.domain.ContaBanco;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ContaBancoReposity {

    List<ContaBanco> consultar();

    Optional<ContaBanco> consultar(UUID id);

    void cadastrar(ContaBanco contaBanco);

    void remover(ContaBanco contaBanco);
}
