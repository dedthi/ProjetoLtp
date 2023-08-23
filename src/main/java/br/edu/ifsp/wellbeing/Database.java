package br.edu.ifsp.wellbeing;

import java.util.ArrayList;

import br.edu.ifsp.wellbeing.model.Aluno;
import br.edu.ifsp.wellbeing.model.Leitura;
import br.edu.ifsp.wellbeing.model.Relatorio;
import br.edu.ifsp.wellbeing.model.Sensor;

public class Database {
    private ArrayList<Sensor> sensores;
    private ArrayList<Aluno> alunos;
    private ArrayList<Relatorio> relatorios;
    private ArrayList<Leitura> leituras;

    public Database(){
        alunos = new ArrayList<>();
        sensores = new ArrayList<>();
        relatorios = new ArrayList<>();
        leituras = new ArrayList<>();
    }
    
    public void init(){
        alunos.add(new Aluno("Marcelo", "734.474.247-02", "Planejada Vista", "BP248376-X", "marcelinho.paulo@gmail.com"));
        sensores.add(new Sensor("BP47295", 90.00, null, "Cardiovascular", null, null));
        relatorios.add(new Relatorio("Paciente está com crise de ansiedade", null, null));
    }

    public void addDadoSensor(Sensor novoSensor){
        sensores.add(novoSensor);
    }
    public void addDadoAluno(Aluno novoAluno){
        alunos.add(novoAluno);
    }

    public void addDadoRelatorio(Relatorio novoRelatorio){
        relatorios.add(novoRelatorio);
    }
    public void addDadoLeitura(Leitura novaLeitura){
        leituras.add(novaLeitura);
    }

    public void delDadoSensor(Sensor delSensor){
        sensores.remove(delSensor);
    }
    public void delDadoAluno(Aluno delAluno){
        alunos.remove(delAluno);
    }
    public void delDadoRelatorio(Relatorio delRelatorio){
        relatorios.remove(delRelatorio);
    }
    public void delDadoLeitura(Leitura delLeitura){
        leituras.remove(delLeitura);
    }

    public ArrayList<Sensor> recupSensors(){
        return sensores;
    }
    public ArrayList<Leitura> recupLeituras(){
        return leituras;
    }
    public ArrayList<Aluno> recupAlunos(){
        return alunos;
    }
     public ArrayList<Relatorio> recupRelatorios(){
        return relatorios;
    }
}
