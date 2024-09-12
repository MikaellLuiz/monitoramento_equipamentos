package com.bootcamp.claro.monitoramento_equipamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bootcamp.claro.monitoramento_equipamentos.model.Usuario;
import com.bootcamp.claro.monitoramento_equipamentos.service.UsuarioService;
import java.util.List;

/**
 * Controlador para gerenciar os usuários no sistema.
 * <p>
 * Este controlador fornece endpoints para criar, ler, atualizar e excluir usuários.
 * </p>
 */
@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    /**
     * Retorna todos os usuários.
     *
     * @return Lista de usuários
     */
    @GetMapping
    public List<Usuario> getAll() {
        return service.findAll();
    }

    /**
     * Retorna um usuário específico com base no ID fornecido.
     *
     * @param id ID do usuário
     * @return Usuário correspondente ao ID fornecido
     */
    @GetMapping("/{id}")
    public Usuario getById(@PathVariable Long id) {
        return service.findById(id);
    }

    /**
     * Cria um novo usuário.
     *
     * @param usuario Objeto usuário a ser criado
     * @return Usuário criado
     */
    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return service.save(usuario);
    }

    /**
     * Atualiza um usuário existente com base no ID fornecido.
     *
     * @param id ID do usuário a ser atualizado
     * @param usuario Objeto usuário com as novas informações
     * @return Usuário atualizado
     */
    @PutMapping("/{id}")
    public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        return service.save(usuario);
    }

    /**
     * Exclui um usuário com base no ID fornecido.
     *
     * @param id ID do usuário a ser excluído
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
