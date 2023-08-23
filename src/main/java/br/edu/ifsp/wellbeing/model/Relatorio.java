package br.edu.ifsp.wellbeing.model;

import java.util.ArrayList;

public class Relatorio{
    private String descricao;
    private String data;
    private String status;
    ArrayList<Relatorio> relatorios;
    ArrayList<Leitura> leituras;

    public Relatorio(String descricao, String data, String status) {
        this.descricao = descricao;
        this.data = data;
        this.status = status;
    }

    public static void gerarRelatorio(ArrayList<Relatorio> relatorios, ArrayList<Leitura> leituras){
        for(int i=0 ; i<relatorios.size() ; i++){
        relatorios.toString();
        }
        for(int i=0 ; i<leituras.size() ; i++){
            leituras.toString();
        }
    }

    public static void atualizarRelatorio(){

    }
    
    public String toString() {
        return "Relatorio: \n[Descricao= " + descricao + "\nData= " + data + "\nStatus= " + status + "]";
    } 

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
