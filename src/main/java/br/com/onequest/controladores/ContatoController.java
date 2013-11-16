package br.com.onequest.controladores;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("contato")
public class ContatoController {

	@RequestMapping("contato/show")
	public String contato(Map<String, Object> model) {
		
		return "contato/show";
	}
}
