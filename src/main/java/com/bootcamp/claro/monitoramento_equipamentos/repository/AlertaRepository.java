package com.bootcamp.claro.monitoramento_equipamentos.repository;

import com.bootcamp.claro.monitoramento_equipamentos.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório para gerenciar entidades {@link Alerta}.
 * <p>
 * Esta interface fornece métodos para operações CRUD básicas, como salvar, excluir e encontrar alertas.
 * </p>
 */
public interface AlertaRepository extends JpaRepository<Alerta, Long> {
}
