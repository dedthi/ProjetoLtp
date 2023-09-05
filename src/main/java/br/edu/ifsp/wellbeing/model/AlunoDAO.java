package br.edu.ifsp.wellbeing.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.wellbeing.Database;

public class AlunoDAO {
    private Database db;
    private static AlunoDAO instance;

    public Database getConnection(){
        if(this.db == null){
            Database db = new Database();
            db.initAlunos();
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

    public Aluno getByName(String nome){
        // Pesquisa no banco alunos por nome
        List<Aluno> todosAlunos = Database.recupAlunos();
        System.out.println(todosAlunos);
        for (Aluno aluno : todosAlunos) {
            System.out.println(aluno.getNome());
            if(aluno.getNome().toLowerCase().equals(nome.toLowerCase())){
                return aluno;
            }
        }
        return null;
        // retornnar as leituras
    }

}
