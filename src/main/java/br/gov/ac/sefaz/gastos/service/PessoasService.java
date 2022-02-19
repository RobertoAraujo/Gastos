package br.gov.ac.sefaz.gastos.service;

import br.gov.ac.sefaz.gastos.model.PessoaEntity;
import br.gov.ac.sefaz.gastos.reposytory.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PessoasService {
    @Autowired
    private PessoaRepository repository;

    public void save(PessoaEntity pessoa) {
        repository.save(pessoa);
    }

    public List<PessoaEntity> findAll() {
        return repository.findAll();
    }

    public List<PessoaEntity> findByNomeInquilino(String nome) {
        return repository.findAllByNomeIsLike(nome);
    }

    public Optional<PessoaEntity> findById(Long id) {
        return repository.findById(id);
    }

    public PessoaEntity update(Long id, PessoaEntity inquilino) {
        PessoaEntity entity = repository.getById(id);
        entity.setNome(inquilino.getNome());
        entity.setNome(inquilino.getNome());
        return repository.save(entity);
    }

    public PessoaEntity delete(Long id) {
        PessoaEntity pessoa= repository.getById(id);
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            System.out.println(e+"aqui deu pau"+ e.getMessage());
        }
        return pessoa;
    }
}
