package com.bootcamp.claro.monitoramento_equipamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bootcamp.claro.monitoramento_equipamentos.model.Desempenho;

/**
 * Repositório para gerenciar entidades {@link Desempenho}.
 * <p>
 * Esta interface fornece métodos para operações CRUD básicas, como salvar, excluir e encontrar desempenhos.
 * </p>
 */
public interface DesempenhoRepository extends JpaRepository<Desempenho, Long> {
}
