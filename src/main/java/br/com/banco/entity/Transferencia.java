package br.com.banco.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "transferencia")
public class Transferencia implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, name = "id")
    private Long idTransferencia;

    @Column(name = "data_transferencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataTransferencia;

    private Double valor;

    private String tipo;

    @Column(name = "nome_operador_transacao")
    private String nomeOperacaoTransacao;

    public static final long serialVersionUID = 1L;
}