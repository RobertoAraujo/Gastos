package br.gov.ac.sefaz.gastos.controller;

import br.gov.ac.sefaz.gastos.model.FinancasEntity;
import br.gov.ac.sefaz.gastos.model.PessoaEntity;
import br.gov.ac.sefaz.gastos.service.FinancasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1/financa")
public class FinancasController {

    Autowired
    private FinancasService service;

    public ResponseEntity<FinancasEntity> cadastrar(@RequestBody FinancasEntity financas, UriComponentsBuilder uriBuilder){
        service.save(financas);
        URI uri = uriBuilder.path("/financas/{id}").buildAndExpand(financas.getId()).toUri();
    }

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<Fina> cadastrar(
            @RequestBody PessoaEntity pessoa, UriComponentsBuilder uriBilder) {
        service.save(pessoa);
        URI uri = uriBilder.path("/pessoa/{id}").buildAndExpand(pessoa.getId()).toUri();
        return ResponseEntity.created(uri).body(
                new PessoaEntity(pessoa.getId(), pessoa.getNome()));
    }
}
