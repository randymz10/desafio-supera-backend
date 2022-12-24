package br.com.banco.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import br.com.banco.model.TransferenciaModel;
import br.com.banco.service.ITransferenciaService;

@RestController
@RequestMapping("/api/transferencia")
public class TransferenciaRestController {

    @Autowired
    ITransferenciaService transferenciaService;

    @GetMapping("/conta/{idConta}")
    public ResponseEntity<List<TransferenciaModel>> getTransferenciaByIdConta(@PathVariable Long idConta) {
        if (!transferenciaService.findByIdConta(idConta).isEmpty()) {
            return new ResponseEntity<>(transferenciaService.findByIdConta(idConta), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/operador/{nomeOperadorTransacao}")
    public ResponseEntity<List<TransferenciaModel>> getTransferenciaByNomeOperadorTransacao(
            @PathVariable String nomeOperadorTransacao) {
        if (!transferenciaService.findByNomeOperadorTransacao(nomeOperadorTransacao).isEmpty()) {
            return new ResponseEntity<>(transferenciaService.findByNomeOperadorTransacao(nomeOperadorTransacao),
                    HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/data")
    public ResponseEntity<List<TransferenciaModel>> getTransferenciaByPeriod(
            @RequestParam("inicio") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") LocalDateTime inicio,
            @RequestParam("termino") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") LocalDateTime termino) {
        if (!transferenciaService.findByPeriod(inicio, termino).isEmpty()) {
            return new ResponseEntity<>(transferenciaService.findByPeriod(inicio, termino), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/allFilters")
    public ResponseEntity<List<TransferenciaModel>> getTransferenciaByAllFilters(
            @RequestParam("dataInicio") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") LocalDateTime dataInicio,
            @RequestParam("dataTermino") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") LocalDateTime dataTermino,
            @RequestParam("nomeOperadorTransacao") String nomeOperadorTransacao) {
        if (!transferenciaService.findByAllFilters(dataInicio, dataTermino, nomeOperadorTransacao).isEmpty()) {
            return new ResponseEntity<>(
                    transferenciaService.findByAllFilters(dataInicio, dataTermino, nomeOperadorTransacao),
                    HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
