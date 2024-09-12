package com.bootcamp.claro.monitoramento_equipamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bootcamp.claro.monitoramento_equipamentos.model.Alerta;
import com.bootcamp.claro.monitoramento_equipamentos.service.AlertaService;
import java.util.List;

/**
 * Controlador para gerenciar os alertas no sistema.
 * <p>
 * Este controlador fornece endpoints para criar, ler, atualizar e excluir alertas.
 * </p>
 */
@RestController
@RequestMapping("/alerts")
public class AlertaController {

    @Autowired
    private AlertaService service;

    /**
     * Retorna todos os alertas.
     *
     * @return Lista de alertas
     */
    @GetMapping
    public List<Alerta> getAll() {
        return service.findAll();
    }

    /**
     * Retorna um alerta específico com base no ID fornecido.
     *
     * @param id ID do alerta
     * @return Alerta correspondente ao ID fornecido
     */
    @GetMapping("/{id}")
    public Alerta getById(@PathVariable Long id) {
        return service.findById(id);
    }

    /**
     * Cria um novo alerta.
     *
     * @param alerta Objeto alerta a ser criado
     * @return Alerta criado
     */
    @PostMapping
    public Alerta create(@RequestBody Alerta alerta) {
        return service.save(alerta);
    }

    /**
     * Atualiza um alerta existente com base no ID fornecido.
     *
     * @param id ID do alerta a ser atualizado
     * @param alerta Objeto alerta com as novas informações
     * @return Alerta atualizado
     */
    @PutMapping("/{id}")
    public Alerta update(@PathVariable Long id, @RequestBody Alerta alerta) {
        alerta.setId(id);
        return service.save(alerta);
    }

    /**
     * Exclui um alerta com base no ID fornecido.
     *
     * @param id ID do alerta a ser excluído
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
