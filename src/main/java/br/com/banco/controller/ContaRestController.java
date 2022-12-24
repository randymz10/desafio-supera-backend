package br.com.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.model.ContaModel;
import br.com.banco.service.IContaService;

@RestController
@RequestMapping("/api/conta")
public class ContaRestController {

    @Autowired
    private IContaService contaService;

    @GetMapping("{idConta}")
    public ResponseEntity<?> getContaById(@PathVariable Long idConta) {
        if (contaService.findByIdConta(idConta) != null) {
            return new ResponseEntity<ContaModel>(contaService.findByIdConta(idConta), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

}
