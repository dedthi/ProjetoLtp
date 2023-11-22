package br.edu.ifsp.wellbeing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno extends Usuario implements AtribuicaoSensores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String password;
    private String endereco;
    private String prontuario;
    private String email;
    
    public Aluno() {
        super();
    }

    public Aluno(String nome, String CPF, String password, String endereco, String prontuario, String email) {
        super(nome,CPF);
        this.password = password;
        this.endereco = endereco;
        this.prontuario = prontuario;
        this.email = email;
    }

    @Override
    public void exibirRelatorio() {
        for(int i=0 ; i<relatorios.size() ; i++){
        Relatorio.gerarRelatorio(relatorios, leituras);
        }
    }
  
    //métodos da classe abstrata Usuario
    @Override
    public String gerarDadosUsuario() {
        return toString();
    }

    @Override
    public void processarLeitura() {
        for(int i=0; i<leituras.size(); i++){
        if(leituras.get(i).getClass() == Leitura.class){
            System.out.println(leituras.get(i).getDescricao());
            }
        }
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + "\nCPF: " + CPF + "\nEndereco: " + endereco + "\nProntuario: " + prontuario + "\nEmail: " + email;
    }

    @Override
    public void adicionarSensor(Sensor sensor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarSensor'");
    }
}
