package br.gov.ac.sefaz.gastos.reposytory;

import br.gov.ac.sefaz.gastos.model.ContaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<ContaEntity, Long> {

}
