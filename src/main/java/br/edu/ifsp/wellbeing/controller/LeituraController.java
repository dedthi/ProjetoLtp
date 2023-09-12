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
     @GetMapping("wellbeing/leitura/{dia}")
      public List<Leitura> consultLeitura(
              @PathVariable("dia")
              Integer dia
      ){
        System.out.println(dia);
        List<Leitura> leituras = LeituraDAO.getInstance().getByDay(dia);
         return leituras;
      }
      //samuel
      @PostMapping("wellbeing/leitura/cadastrar")
      public void addLeitura(@RequestBody Leitura novaleitura){
        Database.addDadoLeitura(novaleitura);
        
      }
      //samuel
      @DeleteMapping("wellbeing/leitura/deletar/{dia}")
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
      asdasdasd

        //Stein
        @GetMapping("/leitura/{dia}/{hora}/{aluno}")
        public Leitura endPoint3(
            @PathVariable("dia") Date dia,
            @PathVariable("hora") Integer hora,
            @PathVariable("aluno") String aluno) {
            if (dia.before(new Date())) { 
                throw new IllegalArgumentException("A data deve ser posterior à data atual");
            }
            if (aluno == null || aluno.isEmpty()) {
                throw new IllegalArgumentException("O aluno deve ser especificado");
            }
            System.out.println(dia+" \\ "+hora+" \\ "+aluno);
            Leitura leituras = LeituraDAO.getInstance().getByDay(dia).getByHour(hora).getByAluno(aluno);
            return leituras; 
        }
      
}asdas 


