package br.com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.banco.model.ContaModel;

@Repository
public interface ContaRepository extends JpaRepository<ContaModel, Long> {
    public ContaModel findByIdConta(Long idConta);
    public ContaModel findByNomeResponsavel(String nomeResponsavel);
    public ContaModel findByIdContaAndNomeResponsavel(Long idConta, String nomeResponsavel);
}
