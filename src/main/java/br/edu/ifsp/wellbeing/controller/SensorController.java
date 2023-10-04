package br.edu.ifsp.wellbeing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.wellbeing.model.Sensor;
import br.edu.ifsp.wellbeing.repository.SensorRepository;


@RestController
public class SensorController {
  
  // get vitor
  @Autowired
  SensorRepository sensorRepository;
  @GetMapping("wellbeing/sensor/listar")
  public List<Sensor> consultSensor(){
    return (List<Sensor>) sensorRepository.findAll();
  }

  // post vitor
  @PostMapping("wellbeing/sensor/cadastrar")
  public String addSensor(@RequestBody Sensor novoSensor) {
    sensorRepository.save(novoSensor);
    return "Sensor cadastrado com Sucesso";
  }

  // delete vitor
  @DeleteMapping("wellbeing/sensor/deletar/{id}")
  public String  deleteSensor(@PathVariable("id") Long id) {
     sensorRepository.deleteById(id);
     return "Deletado com sucesso";
  }
 
}
