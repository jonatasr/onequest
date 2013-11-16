package br.com.onequest.controladores;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("sobre")
public class SobreController {
	
	@RequestMapping("sobre/show")
	public String contato(Map<String, Object> model) {
		
		return "sobre/show";
	}
}
