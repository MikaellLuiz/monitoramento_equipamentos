package com.bootcamp.claro.monitoramento_equipamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.claro.monitoramento_equipamentos.model.Usuario;

/**
 * Repositório para gerenciar entidades {@link Usuario}.
 * <p>
 * Esta interface fornece métodos para operações CRUD básicas, como salvar, excluir e encontrar usuários.
 * </p>
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
