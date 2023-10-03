package br.edu.ifsp.wellbeing.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.wellbeing.model.Relatorio;
import br.edu.ifsp.wellbeing.repository.RelatorioRepository;

@RestController

public class RelatorioController {
    private List<Relatorio> listaRelatorios = new ArrayList<>();

    // STEIN
    @PostMapping("wellbeing/relatorio/cadastrar")
    public ResponseEntity<String> addRelatorio(@RequestBody Relatorio novoRelatorio) {
        listaRelatorios.add(novoRelatorio);
        return ResponseEntity.status(HttpStatus.CREATED).body("Relatório adicionado com sucesso.");
    }


    //STEIN GET 2.0
    @Autowired
    RelatorioRepository relatorioRepository;
    
    @GetMapping("wellbeing/relatorio/{id}")
    public Optional<Relatorio> consultRelatorio(@PathVariable("id") Long id) {
      return (Optional)relatorioRepository.findById(id);
    }


    // STEIN
    @DeleteMapping("/deletar/{descricao}")
    public ResponseEntity<String> deleteRelatorio(@PathVariable("descricao") String descricao) {
        Relatorio relatorioParaExcluir = null;
        for (Relatorio relatorio : listaRelatorios) {
            if (relatorio.getDescricao().equals(descricao)) {
                relatorioParaExcluir = relatorio;
                break;
            }
        }

        if (relatorioParaExcluir != null) {
            listaRelatorios.remove(relatorioParaExcluir);

            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Relatório excluído com sucesso.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Relatório não encontrado.");
        }
    }
}
