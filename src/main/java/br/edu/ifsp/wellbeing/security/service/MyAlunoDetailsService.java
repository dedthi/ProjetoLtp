package br.edu.ifsp.wellbeing.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.edu.ifsp.wellbeing.model.Aluno;
import br.edu.ifsp.wellbeing.repository.AlunoRepository;

public class MyAlunoDetailsService implements UserDetailsService{
    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Aluno alunoCredenciais = alunoRepository.findByUsername(username);
        if(alunoCredenciais == null)
            throw new UsernameNotFoundException(username);
        return new MyAlunoDetails(alunoCredenciais);
    }
    
}
