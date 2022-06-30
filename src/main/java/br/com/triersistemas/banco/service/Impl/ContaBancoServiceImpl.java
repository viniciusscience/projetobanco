package br.com.triersistemas.banco.service.Impl;

import br.com.triersistemas.banco.domain.ContaBanco;
import br.com.triersistemas.banco.exceptions.NaoExisteException;
import br.com.triersistemas.banco.model.ContaBancoModel;
import br.com.triersistemas.banco.model.PagarContaModel;
import br.com.triersistemas.banco.repository.ContaBancoReposity;
import br.com.triersistemas.banco.service.ClienteService;
import br.com.triersistemas.banco.service.ContaBancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ContaBancoServiceImpl implements ContaBancoService {

    @Autowired
    private ContaBancoReposity contaBancoReposity;
    @Autowired
    ClienteService ClienteService;

    @Override
    public List<ContaBanco> consultar() {
        return contaBancoReposity.consultar();
    }

    @Override
    public ContaBanco consultar(UUID id) {
        return contaBancoReposity.consultar(id).orElseThrow(NaoExisteException::new);

    }

    @Override
    public ContaBanco cadastrar(ContaBancoModel model) {
        var cliente = ClienteService.consultar(model.getIdCliente());
        var contaBanco = new ContaBanco(cliente,model.getIdCliente());
        contaBancoReposity.cadastrar(contaBanco);
        return contaBanco;
    }

    @Override
    public ContaBanco remover(UUID id) {
        ContaBanco contaBanco = this.consultar(id);
        contaBancoReposity.remover(contaBanco);
        return contaBanco;
    }

    @Override
    public ContaBanco depositar(UUID id, PagarContaModel model) {
        ContaBanco contaBanco = this.consultar(id);
        return contaBanco.depositar(model.getValor());

    }

    @Override
    public ContaBanco sacar(UUID id, PagarContaModel model) {
        ContaBanco contaBanco = this.consultar(id);
        return contaBanco.sacar(model.getValor());
    }
}

