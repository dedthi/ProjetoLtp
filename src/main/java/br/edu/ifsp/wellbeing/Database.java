package br.edu.ifsp.wellbeing;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.function.Predicate;

import br.edu.ifsp.wellbeing.model.Aluno;
import br.edu.ifsp.wellbeing.model.Leitura;
import br.edu.ifsp.wellbeing.model.Relatorio;
import br.edu.ifsp.wellbeing.model.Sensor;

public class Database {
    private static ArrayList<Sensor> sensores;
    private static ArrayList<Aluno> alunos;
    private static ArrayList<Relatorio> relatorios;
    private static ArrayList<Leitura> leituras;

    // public Database(){
    //     alunos = new ArrayList<>();
    //     sensores = new ArrayList<>();
    //     relatorios = new ArrayList<>();
    //     leituras = new ArrayList<>();
    // }
    
    public static void initAlunos(){
        alunos = new ArrayList<>();
        alunos.add(new Aluno("Marcelo", "734.474.247-02", "Planejada Vista", "BP248376-X", "marcelinho.paulo@gmail.com"));
        alunos.add(new Aluno("Vinicius", "444.333.111-15", "Rua y", "bp3333", "vinicius@gmail.com")); 
    }

    public static void initLeituras(){
        leituras = new ArrayList<>();
        leituras.add(new Leitura(LocalDate.of(2023, 8, 23), 200.0, "null", LocalTime.of(12, 00, 10)));
    }

    public static void initSensores(){
        sensores = new ArrayList<>();
        sensores.add(new Sensor("BP47295", 90.00, "Sensor X", "Cardiovascular", "02-08", "3 meses"));
    }

    public void initRelatorios(){
        relatorios = new ArrayList<>();
        relatorios.add(new Relatorio("Paciente está com ansiedade", "27-08-2023", "Em análise"));
    }
    public static void addDadoSensor(Sensor novoSensor){
        sensores.add(novoSensor);
    }
    public static void addDadoAluno(Aluno novoAluno){
        alunos.add(novoAluno);
    }

    public void addDadoRelatorio(Relatorio novoRelatorio){
        relatorios.add(novoRelatorio);
    }
    public static void addDadoLeitura(Leitura novaLeitura){
        leituras.add(novaLeitura);
    }

    public void delDadoSensor(Sensor delSensor){
        sensores.remove(delSensor);
    }
    public static void delDadoAluno(Aluno delAluno){
        Predicate<Aluno> nomeDel = alunoLista -> alunoLista.getNome() == delAluno.getNome();
		alunos.removeIf(nomeDel);
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
    public static ArrayList<Leitura> recupLeituras(){
        return leituras;
    }
    public static ArrayList<Aluno> recupAlunos(){
        return alunos;
    }
     public static ArrayList<Relatorio> recupRelatorios(){
        return relatorios;
    }

}
