package br.senai.dao.interf;

import java.util.List;

public interface IDAO<T> {
    void inserir(T entidade);
    T buscarPorId(int id);
    List<T> listarTodos();
    void atualizar(T entidade);
    void deletar(int id);

}
