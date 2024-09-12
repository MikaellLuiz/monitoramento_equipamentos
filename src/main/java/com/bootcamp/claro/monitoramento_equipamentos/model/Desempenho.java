package com.bootcamp.claro.monitoramento_equipamentos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

/**
 * Representa um registro de desempenho de um equipamento.
 * <p>
 * Esta entidade armazena as métricas de desempenho de um equipamento em um determinado momento.
 * </p>
 */
@Entity
public class Desempenho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ID do equipamento associado ao desempenho.
     */
    private Long equipamentoId;

    /**
     * Data e hora em que o desempenho foi registrado.
     */
    private LocalDateTime timestamp;

    /**
     * Métrica de desempenho coletada (ex.: temperatura, pressão).
     */
    private String metrico;

    /**
     * Valor da métrica registrada.
     */
    private Double valor;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEquipamentoId() {
        return equipamentoId;
    }

    public void setEquipamentoId(Long equipamentoId) {
        this.equipamentoId = equipamentoId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMetrico() {
        return metrico;
    }

    public void setMetrico(String metrico) {
        this.metrico = metrico;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
