package br.com.banco.service;

import java.time.LocalDateTime;
import java.util.List;

import br.com.banco.model.TransferenciaModel;

public interface ITransferenciaService {
    public TransferenciaModel findByIdTransferencia(Long idTransferencia);
    public List<TransferenciaModel> findByIdConta(Long idConta);
    public List<TransferenciaModel> findByNomeOperadorTransacao(String NomeOperadorTransacao);
    public List<TransferenciaModel> findByPeriod(LocalDateTime inicio, LocalDateTime termino);
   // public List<TransferenciaModel> findByDataTransferenciaAndNomeOperadorTransacao(Date dataTransferencia, String NomeOperadorTransacao);

}
