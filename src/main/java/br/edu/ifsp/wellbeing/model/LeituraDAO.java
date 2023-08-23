
package br.edu.ifsp.wellbeing.model;

import java.util.ArrayList;

import br.edu.ifsp.wellbeing.Database;

public class LeituraDAO {
    private Database db;
    private static LeituraDAO instance;

    public Database getConnection(){
        if(this.db == null){
            Database db = new Database();
            db.init();
            this.db = db;
        }
        return this.db;
    }

    public static LeituraDAO getInstance(){
        if(instance == null){
            instance = new LeituraDAO();
        }
        return instance;
    }
    
    //cria um novo cadastro
    public void create(Leitura novaLeitura){
        Database db = getConnection();
        db.addDadoLeitura(novaLeitura);
    }

    //recupera todas as listas
    public ArrayList<Leitura> read(){
        Database db = getConnection();
        return db.recupLeituras();
    }

    // remove um item do cadastro
    public void delete(Leitura delLeitura){
        Database db = getConnection();
        db.delDadoLeitura(delLeitura);
    }

    public void update(Leitura toUpdate){
        // Sem implementação
    }
}


