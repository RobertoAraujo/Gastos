package br.gov.ac.sefaz.gastos.service;

import br.gov.ac.sefaz.gastos.model.ContaEntity;
import br.gov.ac.sefaz.gastos.model.PessoaEntity;
import br.gov.ac.sefaz.gastos.reposytory.ContaRepository;
import br.gov.ac.sefaz.gastos.reposytory.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    @Autowired
    private ContaRepository repository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public void save(ContaEntity financas) {
        repository.save(financas);
    }

    public List<ContaEntity> findAll() {
        return repository.findAll();
    }

    public PessoaEntity findByIdPessoa(Long id) {
        return pessoaRepository.findById(id).get();
    }
}
