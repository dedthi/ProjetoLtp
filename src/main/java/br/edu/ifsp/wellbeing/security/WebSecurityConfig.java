package br.edu.ifsp.wellbeing.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import br.edu.ifsp.wellbeing.security.service.MyAlunoDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf().disable()
        // .requiresChannel(
        //     channel -> channel.anyRequest().requiresSecure())
            .httpBasic(Customizer.withDefaults())
            .authorizeHttpRequests(
                authorize -> authorize.requestMatchers(HttpMethod.POST, "wellbeing/alunos/cadastrar").permitAll()
                                      .requestMatchers(HttpMethod.POST, "wellbeing/leitura/cadastrar").permitAll()
                                      .requestMatchers(HttpMethod.POST, "wellbeing/relatorio/cadastrar").permitAll()
                                      .requestMatchers(HttpMethod.POST, "wellbeing/sensor/cadastrar").permitAll()
                                      .requestMatchers(HttpMethod.DELETE, "wellbeing/alunos/deletar/{id}").permitAll()
                                      .requestMatchers(HttpMethod.DELETE, "wellbeing/leitura/deletar/{id}").permitAll()
                                      .requestMatchers(HttpMethod.DELETE, "/deletar/{descricao}").permitAll()
                                      .requestMatchers(HttpMethod.DELETE, "wellbeing/sensor/deletar/{id}").permitAll())
            .authorizeHttpRequests(
                authorize -> authorize.requestMatchers(HttpMethod.GET, "wellbeing/alunos/listar").authenticated()
                                      .requestMatchers(HttpMethod.GET, "wellbeing/leitura/{id}").authenticated()
                                      .requestMatchers(HttpMethod.GET, "wellbeing/relatorio/{id}").authenticated()
                                      .requestMatchers(HttpMethod.GET, "wellbeing/sensor/listar").authenticated());
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
            return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService myAlunoDetailsService() {
        return new MyAlunoDetailsService();
    }
    
    // @Bean
    // public UserDetailsService myUserDetailsService(){
    //     UserDetails user = User.withDefaultPasswordEncoder()
    //     .username("ifsp")
    //     .password("1234")
    //     .build();

    //     return new InMemoryUserDetailsManager(user);
    // }
    
}