package br.edu.ifsp.wellbeing.model;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Relatorio{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String data;
    private String status;
    @ManyToOne
    private Usuario usuario;
    // ArrayList<Relatorio> relatorios;
    // ArrayList<Leitura> leituras;

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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
