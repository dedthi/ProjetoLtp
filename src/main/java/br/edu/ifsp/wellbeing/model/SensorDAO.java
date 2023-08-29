package br.edu.ifsp.wellbeing.model;

import java.util.ArrayList;

import br.edu.ifsp.wellbeing.Database;

public class SensorDAO {
    private Database db;
    private static SensorDAO instance;

    public Database getConnection(){
        if(this.db == null){
            Database db = new Database();
            db.initSensores();
            this.db = db;
        }
        return this.db;
    }

    public static SensorDAO getInstance(){
        if(instance == null){
            instance = new SensorDAO();
        }
        return instance;
    }
    
    //cria um novo cadastro
    public void create(Sensor novoSensor){
        Database db = getConnection();
        db.addDadoSensor(novoSensor);
    }

    //recupera todas as listas
    public ArrayList<Sensor> read(){
        Database db = getConnection();
        return db.recupSensors();
    }

    // remove um item do cadastro
    public void delete(Sensor delSensor){
        Database db = getConnection();
        db.delDadoSensor(delSensor);
    }

    public void update(Sensor toUpdate){
        // Sem implementação
    }
}
