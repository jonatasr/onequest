package br.com.onequest.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.onequest.dao.DAOUsuario;
import br.com.onequest.entidades.LayoutPesquisa;
import br.com.onequest.entidades.Pesquisa;
import br.com.onequest.entidades.Usuario;

@Controller("pesquisa")
public class PesquisaController {
	
	@Autowired
	private DAOUsuario daoUsuario;
	
	private Pesquisa pesquisa;
	
	private Usuario usuario;

	@RequestMapping("/pesquisa/show/{id}")
	public ModelAndView pesquisa(@PathVariable("id") Long id) {
		
		ModelAndView mav = new ModelAndView();
		usuario = daoUsuario.get(id);
		pesquisa = new Pesquisa();
		usuario.getPesquisas().add(pesquisa);
		mav.getModel().put("usuario", usuario);
		mav.getModel().put("pesquisa", pesquisa);
		mav.setViewName("pesquisa/show");
		return mav;
	
	}
	
	@RequestMapping(value="/pesquisa/salvar_componentes", method=RequestMethod.POST, 
	produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ModelAndView pesquisa(@RequestBody LayoutPesquisa layoutPesquisa) {
		
		ModelAndView mav = new ModelAndView();
		pesquisa.getLayoutPesquisas().add(layoutPesquisa);
		
		return mav;
	
	}
	
	@RequestMapping(value="/pesquisa/create")
	@ResponseBody
	public Object create() {
			
		return 	(pesquisa.getLayoutPesquisas().size()+1);
				
	}
	@RequestMapping(value="/salvarPesquisa", method=RequestMethod.POST)
	public ModelAndView salvarPesquisa(@PathVariable("id") Long id) {
		
		ModelAndView mav = new ModelAndView();
		Usuario usuario = daoUsuario.get(id);
		Pesquisa pesquisa = new Pesquisa();
		usuario.getPesquisas().add(pesquisa);
		mav.getModel().put("usuario", usuario);
		mav.getModel().put("pesquisa", pesquisa);
		mav.setViewName("pesquisa/show");
		return mav;
	
	}
}
