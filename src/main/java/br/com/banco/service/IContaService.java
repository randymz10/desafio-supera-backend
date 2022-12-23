package br.com.banco.service;

import br.com.banco.model.Conta;

public interface IContaService {
    public Conta findByIdConta(Long idConta);
    public Conta findByNomeResponsavel(String nomeResponsavel);
    public Conta findByIdContaAndNomeResponsavel(Long idConta, String nomeResponsavel);
}
