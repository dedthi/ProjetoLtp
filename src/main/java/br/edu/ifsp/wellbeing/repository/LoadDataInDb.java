package br.edu.ifsp.wellbeing.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.edu.ifsp.wellbeing.model.Aluno;

@Configuration
public class LoadDataInDb implements CommandLineRunner{

    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        ArrayList<Aluno> alunosNovos = new ArrayList<>();
        alunosNovos.add(new Aluno("Thiago", "741328-3", passwordEncoder.encode("ifsp1234"), "Bragança", "Bp301374", "thiago.luiz@aluno.ifsp"));

        alunoRepository.saveAll(alunosNovos);
    }
    
}
