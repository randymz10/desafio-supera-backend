package br.com.banco.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "transferencia")
public class TransferenciaModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, name = "id")
    private Long idTransferencia;

    @Column(name = "data_transferencia")
    private LocalDateTime dataTransferencia;

    private Double valor;

    private String tipo;

    @Column(name = "nome_operador_transacao")
    private String nomeOperadorTransacao;

    @Column(nullable = false, name = "conta_id")
    public Long idConta;

    public static final long serialVersionUID = 1L;
}
