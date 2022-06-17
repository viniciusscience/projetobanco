package br.com.triersistemas.banco.controller;


import br.com.triersistemas.banco.domain.ContaBanco;
import br.com.triersistemas.banco.model.ContaBancoModel;
import br.com.triersistemas.banco.model.PagarContaModel;

import br.com.triersistemas.banco.service.ContaBancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/contabanco")
public class ContaBancoController {

    @Autowired
   private ContaBancoService contaBancoService;

    @GetMapping("/consultar")
    public List<ContaBanco> consultar() {
        return contaBancoService.consultar();
    }

    @PostMapping("/cadastrar")
    public ContaBanco cadastrar(@RequestBody ContaBancoModel model) {
        return contaBancoService.cadastrar(model);
    }

    @DeleteMapping("/remover/{id}")
    public ContaBanco remover(@PathVariable UUID id) {
        return contaBancoService.remover(id);
    }

    @PutMapping("/depositar/{id}")
    public ContaBanco depositar(@PathVariable UUID id, @RequestBody PagarContaModel model) {
        return contaBancoService.depositar(id, model);
    }

    @PutMapping("/sacar/{id}")
    public ContaBanco sacar(@PathVariable UUID id, @RequestBody PagarContaModel model) {
        return contaBancoService.sacar(id, model);
    }
}
