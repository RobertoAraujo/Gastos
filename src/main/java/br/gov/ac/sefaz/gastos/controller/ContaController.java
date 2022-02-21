package br.gov.ac.sefaz.gastos.controller;

import br.gov.ac.sefaz.gastos.model.ContaEntity;
import br.gov.ac.sefaz.gastos.model.PessoaEntity;
import br.gov.ac.sefaz.gastos.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1/conta")
public class ContaController {

    @Autowired
    private ContaService service;

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<ContaEntity> cadastrar(@RequestBody ContaEntity conta, UriComponentsBuilder uriBuilder){
        service.save(conta);
        PessoaEntity byIdPessoa = service.findByIdPessoa(conta.getPessoaId());
        URI uri = uriBuilder.path("/conta/{id}").buildAndExpand(conta.getId()).toUri();
        return  ResponseEntity.created(uri).body(new ContaEntity(conta.getId(), conta.getData()
                ,conta.getDescricao(),conta.getTag(),conta.getValor(),byIdPessoa));
    }

    @GetMapping(value = "/listar")
    public  ResponseEntity<List<ContaEntity>> listarTodasConytas(){
        return  ResponseEntity.ok(service.findAll());
    }

}
