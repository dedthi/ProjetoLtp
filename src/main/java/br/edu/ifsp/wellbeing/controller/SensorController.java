package br.edu.ifsp.wellbeing.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.wellbeing.Database;
import br.edu.ifsp.wellbeing.model.Sensor;


@RestController
public class SensorController {
  // vitor
  // https://localhost:8080/cadastrar/sensor
  @PostMapping("wellbeing/cadastrar/sensor")
  public void addSensor(@RequestBody Sensor novoSensor) {
    Database.addDadoSensor(novoSensor);

  }
  // Para testar
  
  // @GetMapping("wellbeing/sensores/listar")
	// public List<Sensor> recuperarSensors(){
	// 	SensorDAO sensorDAO = SensorDAO.getInstance();
	// 	return 	sensorDAO.read();
	// }

  // vitor
  // https://localhost:8080/deletar/sensor/{nome}

  @DeleteMapping("wellbeing/deletar/sensor/{nome}")
  public Sensor deleteSensor(
      @PathVariable("nome") String nome) {
    List<Sensor> listaSensores = Database.recupSensores();
    for (Sensor sensor : listaSensores) {
      if (sensor.getNome().equals(nome)) {
        Database.delDadoSensor(sensor);
        return sensor;
      }
    }
    return null;
  }
}
