package br.edu.ifsp.wellbeing.model;

public class Aluno extends Usuario implements AtribuicaoSensores {
    private String endereco, prontuario, email;

    public Aluno(String nome, String CPF, String endereco, String prontuario, String email) {
        super(nome,CPF);
        this.endereco = endereco;
        this.prontuario = prontuario;
        this.email = email;
        
    }

    //métodos da classe Interface AtribuicaoSensores
    Sensor monitorando;
    @Override
    public void adicionarSensor(Sensor sensor) {
        monitorando = sensor;
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
    
}
