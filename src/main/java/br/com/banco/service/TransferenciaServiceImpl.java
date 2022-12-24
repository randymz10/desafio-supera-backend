package br.com.banco.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.banco.model.TransferenciaModel;
import br.com.banco.repository.TransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

    @Autowired
    private TransferenciaRepository transferenciaRepository;

    @Override
    public TransferenciaModel findByIdTransferencia(Long idTransferencia) {
        return transferenciaRepository.findByIdTransferencia(idTransferencia);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TransferenciaModel> findByIdConta(Long idConta) {
        return transferenciaRepository.findByIdConta(idConta);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TransferenciaModel> findByNomeOperadorTransacao(String NomeOperadorTransacao) {
        return transferenciaRepository.findByNomeOperadorTransacaoIgnoreCase(NomeOperadorTransacao);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TransferenciaModel> findByPeriod(LocalDateTime inicio, LocalDateTime termino) {
        return transferenciaRepository.findBydataTransferenciaBetween(inicio, termino);
    }

    @Override
    public List<TransferenciaModel> findByAllFilters(LocalDateTime inicio, LocalDateTime termino,
            String NomeOperadorTransacao) {
        return transferenciaRepository.findBydataTransferenciaBetweenAndNomeOperadorTransacao(inicio, termino, NomeOperadorTransacao);
    }

}
