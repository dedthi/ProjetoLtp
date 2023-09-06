package br.edu.ifsp.wellbeing.controller;

import java.util.List;

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
      //samuel
     @GetMapping("/leitura/{dia}")
      public List<Leitura> consultLeitura(
              @PathVariable("dia")
              Integer dia
      ){
        System.out.println(dia);
        List<Leitura> leituras = LeituraDAO.getInstance().getByDay(dia);
         return leituras;
      }
      //samuel
      @PostMapping("/leitura/cadastrar")
      public void addLeitura(@RequestBody Leitura novaleitura){
        Database.addDadoLeitura(novaleitura);
        
      }
      //samuel
      @DeleteMapping("/leitura/deletar/{dia}")
      public Leitura deleteLeitura(
        @PathVariable("dia")
              Integer dia
        ){
          List<Leitura> leituras = LeituraDAO.getInstance().getByDay(dia);
          List<Leitura> listaLeituras = Database.recupLeituras();
          for(Leitura leitura : listaLeituras){
            if(leitura.getDataEntrada().getDayOfMonth() == dia){
              Database.delDadoLeitura(leitura);
              return leitura;
            }
          }
          return null;
        }
      

  /* 
      @GetMapping("/leitura/{dia}/{hora}")
      public Leitura endPoint3(
        @PathVariable("dia") Integer dia,
          @PathVariable("hora") Integer hora) {

          System.out.println(dia+" \\ "+hora);
          Leitura leituras = LeituraDAO.getInstance().getByDay(dia).getByHour(hora);
          return leituras; 

      }
      */
}
