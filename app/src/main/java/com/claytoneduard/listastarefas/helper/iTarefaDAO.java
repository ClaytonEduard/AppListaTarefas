package com.claytoneduard.listastarefas.helper;

import com.claytoneduard.listastarefas.model.Tarefa;

import java.util.List;

public interface iTarefaDAO {

    public boolean salvar(Tarefa tarefa);
    public boolean atualizar(Tarefa tarefa);
    public boolean deletar(Tarefa tarefa);
    public List<Tarefa> listar();



}
