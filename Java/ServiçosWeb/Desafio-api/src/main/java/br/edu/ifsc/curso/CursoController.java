package br.edu.ifsc.curso;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class CursoController {
	
	private final AtomicLong contador = new AtomicLong();
	
	@RequestMapping("/curso")
	public Curso curso(@RequestParam(value="nome",defaultValue="Desconhecido") 
	String nome, @RequestParam(value="cargaHoraria",required = false,defaultValue= "0") int cargaHoraria ) {
		return new Curso(contador.incrementAndGet(), nome, cargaHoraria);
	}
	

}
