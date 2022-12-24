package br.com.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.banco.model.TransferenciaModel;

@Repository
public interface TransferenciaRepository extends JpaRepository<TransferenciaModel, Long> {
    public TransferenciaModel findByIdTransferencia(Long idTransferencia);
    public List<TransferenciaModel> findByIdConta(Long idConta);
    public List<TransferenciaModel> findByNomeOperadorTransacao(String NomeOperadorTransacao);

    public List<TransferenciaModel> findBydataTransferenciaBetween(LocalDateTime inicio, LocalDateTime termino);
   // public List<TransferenciaModel> findByDataTransferenciaAndNomeOperadorTransacao(Date dataTransferencia, String NomeOperadorTransacao);
}
