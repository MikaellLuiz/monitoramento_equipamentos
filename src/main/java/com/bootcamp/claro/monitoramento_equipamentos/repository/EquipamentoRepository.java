package com.bootcamp.claro.monitoramento_equipamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.claro.monitoramento_equipamentos.model.Equipamento;

/**
 * Repositório para gerenciar entidades {@link Equipamento}.
 * <p>
 * Esta interface fornece métodos para operações CRUD básicas, como salvar, excluir e encontrar equipamentos.
 * </p>
 */
public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {
}
