package br.edu.ifsp.wellbeing.wellbeingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifsp.wellbeing.Database;

@SpringBootApplication
public class WellbeingApiApplication {

	public static void main(String[] args) {
		Database.init();
		SpringApplication.run(WellbeingApiApplication.class, args);
	}
}
