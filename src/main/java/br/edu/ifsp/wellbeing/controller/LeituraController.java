package br.edu.ifsp.wellbeing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeituraController {
      //https://localhost:8080/exemplo
      @GetMapping("/exemplo")
      public String endPoint1(){
          return "Exemplo API REST";
      }
  
      @GetMapping("/exemplo/{parametro}")
      public String endPoint2(
              //https://localhost:8080/exemplo/10
              @PathVariable("parametro")
              Integer valor // -> 10
      ){
          return "Dado recebido: "+valor;
      }
  
  
//     @GetMapping("/exemplo/user")
//       public User endPoint3(){
//           User meuUser = new User("Admin", "Admin");
//           return meuUser;
// }
}
