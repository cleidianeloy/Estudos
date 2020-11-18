package br.edu.ifsc.primeiroprojeto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //esta classe será responsavél por receber requisições web
public class MeuPrimeiroControle {
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello!! ";
	}
}
