package br.gov.ac.sefaz.gastos.reposytory;

import br.gov.ac.sefaz.gastos.model.FinancasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancasRepository extends JpaRepository<FinancasEntity, Long> {
}
