package br.edu.ifsc.moeda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversaoMoeda1Application {

	public static void main(String[] args) {
		MoedaDataSource.criarLista();
		SpringApplication.run(ConversaoMoeda1Application.class, args);
	}

}
