package br.gov.ac.sefaz.gastos.reposytory;

import br.gov.ac.sefaz.gastos.model.ContaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContaRepository extends JpaRepository<ContaEntity, Long> {

    Optional<ContaEntity> findAllById(Long id);
}
