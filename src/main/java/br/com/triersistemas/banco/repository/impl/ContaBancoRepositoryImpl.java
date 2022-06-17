package br.com.triersistemas.banco.repository.impl;

import br.com.triersistemas.banco.domain.Cliente;
import br.com.triersistemas.banco.domain.ContaBanco;
import br.com.triersistemas.banco.repository.ContaBancoReposity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ContaBancoRepositoryImpl implements ContaBancoReposity {
    private static final List<ContaBanco> LIST = new ArrayList<>();

    @Override
    public List<ContaBanco> consultar() {
        return LIST;
    }

    @Override
    public Optional<ContaBanco> consultar(UUID id) {
        return LIST.stream().filter(c -> id.equals(c.getId())).findFirst();
    }

    @Override
    public void cadastrar(ContaBanco ContaBanco) {
        LIST.add(ContaBanco);
    }

    @Override
    public void remover(ContaBanco contaBanco) {
        LIST.remove(contaBanco);
    }
}


