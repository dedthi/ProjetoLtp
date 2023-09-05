package br.edu.ifsp.wellbeing.controller;

import java.util.List;

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
      
      @PostMapping("/leitura/cadastrar")
      public void addLeitura(@RequestBody Leitura novaleitura){
        Database.addDadoLeitura(novaleitura);
        
      }


     @GetMapping("/leitura/{dia}")
      public Leitura endPoint2(
              @PathVariable("dia")
              Integer dia
      ){
        System.out.println(dia);
        Leitura leituras = LeituraDAO.getInstance().getByDay(dia);
         return leituras;
        // List<Leitura> resultado = dadospordia(valor);
          //return Database.recupLeituras();
      }
  
      @PostMapping("/leitura/{hora}")
      public Leitura endPoint3(
        @PathVariable("hora") Integer hora) {
          System.out.println(hora);
          Leitura leituras = LeituraDAO.getInstance().getByHour(hora);
          return leituras; 
      }
      
}
