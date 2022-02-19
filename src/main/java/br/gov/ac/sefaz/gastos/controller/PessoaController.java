package br.gov.ac.sefaz.gastos.controller;

import br.gov.ac.sefaz.gastos.model.PessoaEntity;
import br.gov.ac.sefaz.gastos.service.PessoasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1/pessoa")
public class PessoaController {

    @Autowired
    private PessoasService service;

    @GetMapping(value = "/listar")
    public ResponseEntity<List<PessoaEntity>> listarTodos() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = "/nome/{nome}")
    public ResponseEntity<List<PessoaEntity>> listarPorNome(@PathVariable String nome) {
        return ResponseEntity.ok(service.findByNomeInquilino(nome));
    }

    @GetMapping(value = "id/{id}")
    public ResponseEntity<Object> listarPorId(@PathVariable("id") long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<PessoaEntity> cadastrar(
            @RequestBody PessoaEntity pessoa, UriComponentsBuilder uriBilder) {
        service.save(pessoa);
        URI uri = uriBilder.path("/inquilino/{id}").buildAndExpand(pessoa.getId()).toUri();
        return ResponseEntity.created(uri).body(
                new PessoaEntity(pessoa.getId(), pessoa.getNome()));
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<PessoaEntity> update(@Validated @PathVariable Long id, @RequestBody PessoaEntity pessoa) {
        PessoaEntity entity = service.update(id, pessoa);
        return ResponseEntity.ok().body(entity);
    }

    @DeleteMapping(value = "/deletar/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
