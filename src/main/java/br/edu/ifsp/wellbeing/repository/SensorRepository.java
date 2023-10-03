package br.edu.ifsp.wellbeing.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifsp.wellbeing.model.Sensor;

public interface SensorRepository extends CrudRepository<Sensor, Long>{
    
}
