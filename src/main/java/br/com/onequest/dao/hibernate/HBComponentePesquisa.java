package br.com.onequest.dao.hibernate;

import org.springframework.stereotype.Repository;

import br.com.onequest.dao.DAOComponentePesquisa;
import br.com.onequest.entidades.ComponentePesquisa;

@Repository
public class HBComponentePesquisa extends HBDAO<ComponentePesquisa> implements DAOComponentePesquisa{

	@Override
	protected Class getClazz() {
		
		return ComponentePesquisa.class;
	}

}
