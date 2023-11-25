package br.edu.ifsp.wellbeing.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Sensor {    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipoSensor;
    private String dataEntrada;
    private String garantia;
    @OneToMany(mappedBy = "sensorPai")
    ArrayList<Sensor> sensoresMonitorados;

    @ManyToOne
    private Sensor sensorPai;    

    public Sensor() {
    }

    public Sensor(String codigo, double preco, String nome, String tipoSensor, String dataEntrada, String garantia) {
        this.nome = nome;
        this.tipoSensor = tipoSensor;
        this.dataEntrada = dataEntrada;
        this.garantia = garantia;
    }

    public static void imprimirSensor(List<Sensor> sensoresMonitorados2) {
        for(int i=0 ; i<sensoresMonitorados2.size() ; i++){
                System.out.println(sensoresMonitorados2.get(i));
             }
        }
    
    public static void deletarSensor(ArrayList<Sensor> sensoresMonitorados) {
        Scanner x = new Scanner(System.in);
        String buscaItem;
        System.out.println("Digite o nome do sensor que deseja apagar: ");
        buscaItem = x.next();
            for(int i=0 ; i<sensoresMonitorados.size() ; i++){
                if((sensoresMonitorados.get(i)).getNome().equals(buscaItem) == true) {
                    sensoresMonitorados.remove(i);
                }
            }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public ArrayList<Sensor> getSensoresMonitorados() {
        return sensoresMonitorados;
    }

    public void setSensoresMonitorados(ArrayList<Sensor> sensoresMonitorados) {
        this.sensoresMonitorados = sensoresMonitorados;
    }

    public Sensor getSensorPai() {
        return sensorPai;
    }

    public void setSensorPai(Sensor sensorPai) {
        this.sensorPai = sensorPai;
    }

    
}
