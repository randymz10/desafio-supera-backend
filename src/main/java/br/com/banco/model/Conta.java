package br.com.banco.model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "conta")
public class Conta implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "id_conta")
    private Long idConta;

    @Column(name = "nome_responsavel")
    private String nomeResponsavel;

    @OneToMany(mappedBy = "idConta")
    private List<Transferencia> transferencias = new ArrayList<>(); 

    private static final long serialVersionUID = 1L;
}
