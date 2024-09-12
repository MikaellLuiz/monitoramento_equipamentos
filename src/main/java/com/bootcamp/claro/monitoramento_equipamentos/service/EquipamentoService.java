package com.bootcamp.claro.monitoramento_equipamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.claro.monitoramento_equipamentos.model.Equipamento;
import com.bootcamp.claro.monitoramento_equipamentos.repository.EquipamentoRepository;
import java.util.List;

/**
 * Serviço para gerenciar operações relacionadas aos equipamentos.
 * <p>
 * Este serviço fornece métodos para encontrar, criar, atualizar e excluir equipamentos, utilizando o repositório {@link EquipamentoRepository}.
 * </p>
 */
@Service
public class EquipamentoService {

    @Autowired
    private EquipamentoRepository repository;

    /**
     * Retorna todos os equipamentos.
     *
     * @return Lista de equipamentos
     */
    public List<Equipamento> findAll() {
        return repository.findAll();
    }

    /**
     * Retorna um equipamento específico com base no ID fornecido.
     *
     * @param id ID do equipamento
     * @return Equipamento correspondente ao ID fornecido, ou null se não encontrado
     */
    public Equipamento findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * Salva um equipamento no repositório.
     *
     * @param equipamento Objeto equipamento a ser salvo
     * @return Equipamento salvo
     */
    public Equipamento save(Equipamento equipamento) {
        return repository.save(equipamento);
    }

    /**
     * Exclui um equipamento com base no ID fornecido.
     *
     * @param id ID do equipamento a ser excluído
     */
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
