package br.com.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.com.banco.model.Conta;
import br.com.banco.repository.ContaRepository;

public class ContaServiceImpl implements IContaService{
    
    @Autowired
    private ContaRepository contaRepository;

    @Override
    @Transactional(readOnly = true)
    public Conta findByIdConta(Long idConta) {
        return contaRepository.findByIdConta(idConta);
    }

    @Override
    @Transactional(readOnly = true)
    public Conta findByNomeResponsavel(String nomeResponsavel) {
        return contaRepository.findByNomeResponsavel(nomeResponsavel);
    }
    
}
