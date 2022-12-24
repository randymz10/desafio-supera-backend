package br.com.banco.service;

import br.com.banco.model.ContaModel;

public interface IContaService {
    public ContaModel findByIdConta(Long idConta);
}
