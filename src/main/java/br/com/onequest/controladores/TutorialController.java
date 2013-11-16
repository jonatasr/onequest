package br.com.onequest.controladores;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("tutorial")
public class TutorialController {
	
	@RequestMapping("tutorial/show")
	public String tutorial(Map<String, Object> model) {
		
		return "tutorial/show";
	}

}
