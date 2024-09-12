package com.bootcamp.claro.monitoramento_equipamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bootcamp.claro.monitoramento_equipamentos.model.Equipamento;
import com.bootcamp.claro.monitoramento_equipamentos.service.EquipamentoService;
import java.util.List;

/**
 * Controlador para gerenciar os equipamentos no sistema.
 * <p>
 * Este controlador fornece endpoints para criar, ler, atualizar e excluir equipamentos.
 * </p>
 */
@RestController
@RequestMapping("/equipment")
public class EquipamentoController {

    @Autowired
    private EquipamentoService service;

    /**
     * Retorna todos os equipamentos.
     *
     * @return Lista de equipamentos
     */
    @GetMapping
    public List<Equipamento> getAll() {
        return service.findAll();
    }

    /**
     * Retorna um equipamento específico com base no ID fornecido.
     *
     * @param id ID do equipamento
     * @return Equipamento correspondente ao ID fornecido
     */
    @GetMapping("/{id}")
    public Equipamento getById(@PathVariable Long id) {
        return service.findById(id);
    }

    /**
     * Cria um novo equipamento.
     *
     * @param equipamento Objeto equipamento a ser criado
     * @return Equipamento criado
     */
    @PostMapping
    public Equipamento create(@RequestBody Equipamento equipamento) {
        return service.save(equipamento);
    }

    /**
     * Atualiza um equipamento existente com base no ID fornecido.
     *
     * @param id ID do equipamento a ser atualizado
     * @param equipamento Objeto equipamento com as novas informações
     * @return Equipamento atualizado
     */
    @PutMapping("/{id}")
    public Equipamento update(@PathVariable Long id, @RequestBody Equipamento equipamento) {
        equipamento.setId(id);
        return service.save(equipamento);
    }

    /**
     * Exclui um equipamento com base no ID fornecido.
     *
     * @param id ID do equipamento a ser excluído
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
