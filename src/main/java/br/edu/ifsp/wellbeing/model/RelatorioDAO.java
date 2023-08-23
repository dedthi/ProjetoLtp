package br.edu.ifsp.wellbeing.model;

import java.util.ArrayList;

import br.edu.ifsp.wellbeing.Database;

public class RelatorioDAO {
    private Database db;
    private static RelatorioDAO instance;

    public Database getConnection(){
        if(this.db == null){
            Database db = new Database();
            db.init();
            this.db = db;
        }
        return this.db;
    }

    public static RelatorioDAO getInstance(){
        if(instance == null){
            instance = new RelatorioDAO();
        }
        return instance;
    }
    
    //cria um novo cadastro
    public void create(Relatorio novoRelatorio){
        Database db = getConnection();
        db.addDadoRelatorio(novoRelatorio);
    }

    //recupera todas as listas
    public ArrayList<Relatorio> read(){
        Database db = getConnection();
        return db.recupRelatorios();
    }

    // remove um item do cadastro
    public void delete(Relatorio delRelatorio){
        Database db = getConnection();
        db.delDadoRelatorio(delRelatorio);
    }

    public void update(Relatorio toUpdate){
        // Sem implementação
    }
}
