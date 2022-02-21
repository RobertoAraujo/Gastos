package br.gov.ac.sefaz.gastos.controller;

import br.gov.ac.sefaz.gastos.model.ContaEntity;
import br.gov.ac.sefaz.gastos.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1/conta")
public class ContaController {

    @Autowired
    private ContaService service;

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<ContaEntity> cadastrar(@RequestBody ContaEntity financas, UriComponentsBuilder uriBuilder){
        service.save(financas);
        URI uri = uriBuilder.path("/financas/{id}").buildAndExpand(financas.getId()).toUri();
        return  ResponseEntity.created(uri).body(new ContaEntity(financas.getId(), financas.getData()
                ,financas.getDescricao(),financas.getTag(),financas.getValor()));
    }

}
