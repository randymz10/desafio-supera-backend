package br.com.banco.service;

import java.util.List;

import br.com.banco.model.Transferencia;

public interface ITransferenciaService {
    public Transferencia findByIdConta();
    public List<Transferencia> findByNomeOperadorTransacao();
    public List<Transferencia> findByDataTransferencia();
    public List<Transferencia> findByDataTransferenciaAndNomeOperadorTransacao();

}
