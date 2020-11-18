package br.edu.ifsc.funcionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DinheiroApi1Application {

	public static void main(String[] args) {
		DinheiroDataSource.criarLista();
		SpringApplication.run(DinheiroApi1Application.class, args);
	}

}
