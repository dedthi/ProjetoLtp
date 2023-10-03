package br.edu.ifsp.wellbeing.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.wellbeing.Database;
import br.edu.ifsp.wellbeing.model.Leitura;
// import br.edu.ifsp.wellbeing.model.LeituraDAO;
// import br.edu.ifsp.wellbeing.model.Usuario;
import br.edu.ifsp.wellbeing.repository.LeituraRepository;
import br.edu.ifsp.wellbeing.repository.RelatorioRepository;


@RestController
public class LeituraController {
  // samuel
  @Autowired
  LeituraRepository leituraRepository;
  @GetMapping("wellbeing/leitura/{id}")
  public Optional<Leitura> consultLeitura(@PathVariable("id") Long id){
    return (Optional<Leitura>)leituraRepository.findById(id);
    
  }
 
  // samuel
  @PostMapping("wellbeing/leitura/cadastrar")
  public String addLeitura(@RequestBody Leitura novaleitura) {
    leituraRepository.save(novaleitura);
    return "Cadastrado com sucesso";
  }

  // samuel
  @DeleteMapping("wellbeing/leitura/deletar/{id}")
  public String deleteLeitura(@PathVariable("id") Long id) {
     leituraRepository.deleteById(id);
     return "Deletado com sucesso";
  }
  
}