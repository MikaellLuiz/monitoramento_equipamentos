package com.bootcamp.claro.monitoramento_equipamentos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

/**
 * Representa um alerta gerado para um equipamento.
 * <p>
 * Esta entidade armazena informações sobre alertas que são emitidos para equipamentos,
 * incluindo o tipo de alerta, a descrição e o momento em que o alerta foi gerado.
 * </p>
 */
@Entity
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ID do equipamento associado ao alerta.
     */
    private Long equipamentoId;

    /**
     * Data e hora em que o alerta foi gerado.
     */
    private LocalDateTime timestamp;

    /**
     * Tipo do alerta (ex.: falha, aviso).
     */
    private String tipo;

    /**
     * Descrição detalhada do alerta.
     */
    private String descricao;

    // Getters e Setters

    /**
     * Obtém o ID do alerta.
     *
     * @return ID do alerta
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o ID do alerta.
     *
     * @param id ID do alerta
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtém o ID do equipamento associado ao alerta.
     *
     * @return ID do equipamento
     */
    public Long getEquipamentoId() {
        return equipamentoId;
    }

    /**
     * Define o ID do equipamento associado ao alerta.
     *
     * @param equipamentoId ID do equipamento
     */
    public void setEquipamentoId(Long equipamentoId) {
        this.equipamentoId = equipamentoId;
    }

    /**
     * Obtém a data e hora em que o alerta foi gerado.
     *
     * @return Data e hora do alerta
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Define a data e hora em que o alerta foi gerado.
     *
     * @param timestamp Data e hora do alerta
     */
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Obtém o tipo do alerta.
     *
     * @return Tipo do alerta
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo do alerta.
     *
     * @param tipo Tipo do alerta
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtém a descrição detalhada do alerta.
     *
     * @return Descrição do alerta
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição detalhada do alerta.
     *
     * @param descricao Descrição do alerta
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
