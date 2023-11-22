package br.edu.ifsp.wellbeing.security.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.edu.ifsp.wellbeing.model.Aluno;

public class MyAlunoDetails implements UserDetails{
    private Aluno alunoDoSistema;

    public MyAlunoDetails(Aluno aluno){
        this.alunoDoSistema = aluno;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.alunoDoSistema.getPassword();
    }

    @Override
    public String getUsername() {
        return this.alunoDoSistema.getNome();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
