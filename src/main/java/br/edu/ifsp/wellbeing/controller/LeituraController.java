package br.edu.ifsp.wellbeing.controller;

import java.sql.Date;
import java.util.List;

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
import br.edu.ifsp.wellbeing.model.LeituraDAO;

@RestController
public class LeituraController {
  // samuel
  @GetMapping("wellbeing/leitura/{dia}")
  public List<Leitura> consultLeitura(
      @PathVariable("dia") Integer dia) {
    System.out.println(dia);
    List<Leitura> leituras = LeituraDAO.getInstance().getByDay(dia);
    return leituras;
  }

  // samuel
  @PostMapping("wellbeing/leitura/cadastrar")
  public void addLeitura(@RequestBody Leitura novaleitura) {
    Database.addDadoLeitura(novaleitura);

  }

  // samuel
  @DeleteMapping("wellbeing/leitura/deletar/{dia}")
  public Leitura deleteLeitura(
      @PathVariable("dia") Integer dia) {
    List<Leitura> leituras = LeituraDAO.getInstance().getByDay(dia);
    List<Leitura> listaLeituras = Database.recupLeituras();
    for (Leitura leitura : listaLeituras) {
      if (leitura.getDataEntrada().getDayOfMonth() == dia) {
        Database.delDadoLeitura(leitura);
        return leitura;
      }
    }
    return null;
  }

  // Stein
  
@GetMapping("wellbeing/leitura/{dia}/{hora}")
public ResponseEntity<List<Leitura>> consultLeitura(
      @PathVariable("dia") Integer dia,
      @PathVariable("hora") Integer hora) {
    // Verifica se os parâmetros são válidos
    if (dia <= 0 || hora <= 0) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    // Obtém as leituras
    List<Leitura> leituras = (List<Leitura>) ((LeituraDAO) LeituraDAO.getInstance().getByDay(dia)).getByHour(hora); //getByHour(hora) estava morte 
                                                                                                                    //e meti umas correcao do propio sistema, 
                                                                                                                    //o que resultou em "pegavel"
    // Retorna a resposta
    return ResponseEntity.ok(leituras);
  }

}
