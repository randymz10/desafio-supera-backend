package br.com.banco.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.com.banco.model.Transferencia;
import br.com.banco.repository.TransferenciaRepository;

public class TransferenciaServiceImpl implements ITransferenciaService {

    @Autowired
    private TransferenciaRepository transferenciaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Transferencia> findByIdConta(Long idConta) {
        return transferenciaRepository.findByIdConta(idConta);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Transferencia> findByNomeOperadorTransacao(String NomeOperadorTransacao) {
        return transferenciaRepository.findByNomeOperadorTransacao(NomeOperadorTransacao);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Transferencia> findByDataTransferencia(Date dataTransferencia) {
        return transferenciaRepository.findByDataTransferencia(dataTransferencia);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Transferencia> findByDataTransferenciaAndNomeOperadorTransacao(Date dataTransferencia,
            String NomeOperadorTransacao) {
        return transferenciaRepository.findByDataTransferenciaAndNomeOperadorTransacao(dataTransferencia, NomeOperadorTransacao);
    }

}
