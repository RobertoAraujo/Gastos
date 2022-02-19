package br.gov.ac.sefaz.gastos.reposytory;

import br.gov.ac.sefaz.gastos.model.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
}
