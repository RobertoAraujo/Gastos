package br.gov.ac.sefaz.gastos.reposytory;

import br.gov.ac.sefaz.gastos.model.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {

    List<PessoaEntity> findAllByNomeIsLike(String nome);

    Optional<PessoaEntity> findById(Long id);
}
