package com.bootcamp.claro.monitoramento_equipamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.claro.monitoramento_equipamentos.model.Desempenho;
import com.bootcamp.claro.monitoramento_equipamentos.repository.DesempenhoRepository;
import java.util.List;

/**
 * Serviço para gerenciar operações relacionadas ao desempenho.
 * <p>
 * Este serviço fornece métodos para encontrar, criar, atualizar e excluir desempenhos, utilizando o repositório {@link DesempenhoRepository}.
 * </p>
 */
@Service
public class DesempenhoService {

    @Autowired
    private DesempenhoRepository repository;

    /**
     * Retorna todos os desempenhos.
     *
     * @return Lista de desempenhos
     */
    public List<Desempenho> findAll() {
        return repository.findAll();
    }

    /**
     * Retorna um desempenho específico com base no ID fornecido.
     *
     * @param id ID do desempenho
     * @return Desempenho correspondente ao ID fornecido, ou null se não encontrado
     */
    public Desempenho findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * Salva um desempenho no repositório.
     *
     * @param desempenho Objeto desempenho a ser salvo
     * @return Desempenho salvo
     */
    public Desempenho save(Desempenho desempenho) {
        return repository.save(desempenho);
    }

    /**
     * Exclui um desempenho com base no ID fornecido.
     *
     * @param id ID do desempenho a ser excluído
     */
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
