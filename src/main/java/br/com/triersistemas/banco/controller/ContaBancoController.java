package br.com.triersistemas.banco.controller;


import br.com.triersistemas.banco.service.Impl.ContaBancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contabanco")

public class ContaBancoController {

    @Autowired
    ContaBancoService contaBancoService;

}
