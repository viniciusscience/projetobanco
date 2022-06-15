package br.com.triersistemas.banco.repository.impl;

import br.com.triersistemas.banco.domain.ContaBanco;
import br.com.triersistemas.banco.repository.ContaBancoReposity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository
public class ContaBancoImpl implements ContaBancoReposity {
    @Override
    public List<ContaBanco> consultar() {
        return null;
    }

    @Override
    public void cadastrar(ContaBanco contaBanco) {

    }

    @Override
    public void remover(ContaBanco contaBanco) {

    }
}
