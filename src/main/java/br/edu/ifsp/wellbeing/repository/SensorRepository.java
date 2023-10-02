package br.edu.ifsp.wellbeing.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifsp.wellbeing.model.Leitura;

public interface SensorRepository extends CrudRepository<Leitura, Long>{
    
}
