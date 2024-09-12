package com.bootcamp.claro.monitoramento_equipamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.claro.monitoramento_equipamentos.model.Usuario;
import com.bootcamp.claro.monitoramento_equipamentos.repository.UsuarioRepository;
import java.util.List;

/**
 * Serviço para gerenciar operações relacionadas aos usuários.
 * <p>
 * Este serviço fornece métodos para encontrar, criar, atualizar e excluir usuários, utilizando o repositório {@link UsuarioRepository}.
 * </p>
 */
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    /**
     * Retorna todos os usuários.
     *
     * @return Lista de usuários
     */
    public List<Usuario> findAll() {
        return repository.findAll();
    }

    /**
     * Retorna um usuário específico com base no ID fornecido.
     *
     * @param id ID do usuário
     * @return Usuário correspondente ao ID fornecido, ou null se não encontrado
     */
    public Usuario findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * Salva um usuário no repositório.
     *
     * @param usuario Objeto usuário a ser salvo
     * @return Usuário salvo
     */
    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }

    /**
     * Exclui um usuário com base no ID fornecido.
     *
     * @param id ID do usuário a ser excluído
     */
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
