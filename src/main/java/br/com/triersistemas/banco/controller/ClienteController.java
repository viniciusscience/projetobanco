package br.com.triersistemas.banco.controller;


import br.com.triersistemas.banco.domain.Cliente;
import br.com.triersistemas.banco.model.ClienteModel;
import br.com.triersistemas.banco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/consultar")
    public List<Cliente> consultar() {
        return clienteService.consultar();
    }
    @PostMapping("/cadastrar")
    public Cliente cadastrar(@RequestBody  ClienteModel model) {
        return clienteService.cadastrar(model);
    }

    @PutMapping("/alterar/{id}")
    public Cliente alterar(@PathVariable UUID id, @RequestBody  ClienteModel model) {
        return clienteService.alterar(id, model);
    }

    @DeleteMapping("/remover/{id}")
    public Cliente remover(@PathVariable UUID id) {
        return clienteService.remover(id);
    }
}