package br.com.banco.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banco.model.Transferencia;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
    public List<Transferencia> findByIdConta(Long idConta);
    public List<Transferencia> findByNomeOperadorTransacao(String NomeOperadorTransacao);
    public List<Transferencia> findByDataTransferencia(Date dataTransferencia);
    public List<Transferencia> findByDataTransferenciaAndNomeOperadorTransacao(Date dataTransferencia, String NomeOperadorTransacao);
}
