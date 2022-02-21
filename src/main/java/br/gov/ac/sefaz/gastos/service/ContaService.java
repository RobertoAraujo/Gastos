package br.gov.ac.sefaz.gastos.service;

import br.gov.ac.sefaz.gastos.model.ContaEntity;
import br.gov.ac.sefaz.gastos.reposytory.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    @Autowired
    private ContaRepository repository;

    public void save(ContaEntity financas) {
        repository.save(financas);
    }
}
