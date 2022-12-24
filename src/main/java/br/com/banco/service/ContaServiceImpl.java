package br.com.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.banco.model.ContaModel;
import br.com.banco.repository.ContaRepository;

@Service
public class ContaServiceImpl implements IContaService{
    
    @Autowired
    private ContaRepository contaRepository;

    @Override
    @Transactional(readOnly = true)
    public ContaModel findByIdConta(Long idConta) {
        return contaRepository.findByIdConta(idConta);
    }
    
}
