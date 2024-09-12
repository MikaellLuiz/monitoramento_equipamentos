package com.bootcamp.claro.monitoramento_equipamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bootcamp.claro.monitoramento_equipamentos.model.Desempenho;
import com.bootcamp.claro.monitoramento_equipamentos.service.DesempenhoService;
import java.util.List;

/**
 * Controlador para gerenciar o desempenho dos equipamentos.
 * <p>
 * Este controlador fornece endpoints para criar, ler, atualizar e excluir informações de desempenho.
 * </p>
 */
@RestController
@RequestMapping("/performance")
public class DesempenhoController {

    @Autowired
    private DesempenhoService service;

    /**
     * Retorna todos os registros de desempenho.
     *
     * @return Lista de desempenhos
     */
    @GetMapping
    public List<Desempenho> getAll() {
        return service.findAll();
    }

    /**
     * Retorna um registro de desempenho específico com base no ID fornecido.
     *
     * @param id ID do desempenho
     * @return Desempenho correspondente ao ID fornecido
     */
    @GetMapping("/{id}")
    public Desempenho getById(@PathVariable Long id) {
        return service.findById(id);
    }

    /**
     * Cria um novo registro de desempenho.
     *
     * @param desempenho Objeto desempenho a ser criado
     * @return Desempenho criado
     */
    @PostMapping
    public Desempenho create(@RequestBody Desempenho desempenho) {
        return service.save(desempenho);
    }

    /**
     * Atualiza um registro de desempenho existente com base no ID fornecido.
     *
     * @param id ID do desempenho a ser atualizado
     * @param desempenho Objeto desempenho com as novas informações
     * @return Desempenho atualizado
     */
    @PutMapping("/{id}")
    public Desempenho update(@PathVariable Long id, @RequestBody Desempenho desempenho) {
        desempenho.setId(id);
        return service.save(desempenho);
    }

    /**
     * Exclui um registro de desempenho com base no ID fornecido.
     *
     * @param id ID do desempenho a ser excluído
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
