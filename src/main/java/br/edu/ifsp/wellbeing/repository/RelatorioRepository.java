package br.edu.ifsp.wellbeing.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifsp.wellbeing.model.Leitura;

public interface RelatorioRepository extends CrudRepository<Leitura, Long>{
    
}
