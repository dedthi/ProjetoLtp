package br.edu.ifsp.wellbeing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WellbeingApiApplication {

	public static void main(String[] args) {
		Database.initAlunos();
		Database.initLeituras();
		Database.initSensores();
		SpringApplication.run(WellbeingApiApplication.class, args);
	}
}
