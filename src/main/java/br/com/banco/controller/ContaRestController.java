package br.com.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.service.IContaService;

@RestController
@RequestMapping("/api/conta")
public class ContaRestController {
    
    @Autowired
    private IContaService contaService;

}
