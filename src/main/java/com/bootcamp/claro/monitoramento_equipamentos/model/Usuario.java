package com.bootcamp.claro.monitoramento_equipamentos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Representa um usuário do sistema.
 * <p>
 * Esta entidade armazena informações sobre os usuários, incluindo nome, e-mail e tipo de usuário.
 * </p>
 */
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nome completo do usuário.
     */
    private String nome;

    /**
     * Endereço de e-mail do usuário.
     */
    private String email;

    /**
     * Tipo de usuário (ex.: administrador, usuário comum).
     */
    private String tipoUsuario;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
