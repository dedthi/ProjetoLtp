package br.edu.ifsp.wellbeing.model;

import java.util.ArrayList;

import br.edu.ifsp.wellbeing.Database;

public class AlunoDAO {
    private Database db;
    private static AlunoDAO instance;

    public Database getConnection(){
        if(this.db == null){
            Database db = new Database();
            db.init();
            this.db = db;
        }
        return this.db;
    }

    public static AlunoDAO getInstance(){
        if(instance == null){
            instance = new AlunoDAO();
        }
        return instance;
    }
    
    //cria um novo cadastro
    public void create(Aluno novoAluno){
        Database db = getConnection();
        db.addDadoAluno(novoAluno);
    }

    //recupera todas as listas
    public ArrayList<Aluno> read(){
        Database db = getConnection();
        return db.recupAlunos();
    }

    // remove um item do cadastro
    public void delete(Aluno delAluno){
        Database db = getConnection();
        db.delDadoAluno(delAluno);
    }

    public void update(Aluno toUpdate){
        // Sem implementação
    }
}
