package com.claytoneduard.listastarefas.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.claytoneduard.listastarefas.model.Tarefa;

import java.util.List;

public class TarefaDAO implements iTarefaDAO {

    private SQLiteDatabase escreveDb;
    private SQLiteDatabase leDb;

    public TarefaDAO(Context context) {
        DbHelper db = new DbHelper(context);
        escreveDb = db.getWritableDatabase(); // escreve os dados no banco
        leDb = db.getReadableDatabase(); //  le os dados do banco
    }

    @Override
    public boolean salvar(Tarefa tarefa) {

        ContentValues cv = new ContentValues();// define itens tendo a aparencia de um ARRAY
        cv.put("nome", tarefa.getNomeTarefa());

        try {
            escreveDb.insert(DbHelper.TABELA_TAREFAS, null, cv);
            Log.i("INFO", "Tarefa salva com suscesso!");
        } catch (Exception e) {
            Log.e("INFO", "Erro ao salvar tarefa " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean atualizar(Tarefa tarefa) {
        return false;
    }

    @Override
    public boolean deletar(Tarefa tarefa) {
        return false;
    }

    @Override
    public List<Tarefa> listar() {
        return null;
    }
}
