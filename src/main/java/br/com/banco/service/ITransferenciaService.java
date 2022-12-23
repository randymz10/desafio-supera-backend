package br.com.banco.service;

import java.util.Date;
import java.util.List;

import br.com.banco.model.Transferencia;

public interface ITransferenciaService {
    public List<Transferencia> findByIdConta(Long idConta);
    public List<Transferencia> findByNomeOperadorTransacao(String NomeOperadorTransacao);
    public List<Transferencia> findByDataTransferencia(Date dataTransferencia);
    public List<Transferencia> findByDataTransferenciaAndNomeOperadorTransacao(Date dataTransferencia, String NomeOperadorTransacao);

}
