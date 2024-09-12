package com.bootcamp.claro.monitoramento_equipamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.claro.monitoramento_equipamentos.model.Alerta;
import com.bootcamp.claro.monitoramento_equipamentos.repository.AlertaRepository;

import java.util.List;

/**
 * Serviço para gerenciar operações relacionadas aos alertas.
 * <p>
 * Este serviço fornece métodos para encontrar, criar, atualizar e excluir alertas, utilizando o repositório {@link AlertaRepository}.
 * </p>
 */
@Service
public class AlertaService {

    @Autowired
    private AlertaRepository repository;

    /**
     * Retorna todos os alertas.
     *
     * @return Lista de alertas
     */
    public List<Alerta> findAll() {
        return repository.findAll();
    }

    /**
     * Retorna um alerta específico com base no ID fornecido.
     *
     * @param id ID do alerta
     * @return Alerta correspondente ao ID fornecido, ou null se não encontrado
     */
    public Alerta findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * Salva um alerta no repositório.
     *
     * @param alerta Objeto alerta a ser salvo
     * @return Alerta salvo
     */
    public Alerta save(Alerta alerta) {
        return repository.save(alerta);
    }

    /**
     * Exclui um alerta com base no ID fornecido.
     *
     * @param id ID do alerta a ser excluído
     */
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
