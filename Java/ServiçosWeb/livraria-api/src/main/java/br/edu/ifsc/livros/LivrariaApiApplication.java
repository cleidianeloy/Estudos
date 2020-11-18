package br.edu.ifsc.livros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LivrariaApiApplication {

	public static void main(String[] args) {
//1° OBS:NECESSÁRIO P/ CRIAÇÃO DA LISTA.
		LivroDataSource.criarLista();
		SpringApplication.run(LivrariaApiApplication.class, args);
	}

}
