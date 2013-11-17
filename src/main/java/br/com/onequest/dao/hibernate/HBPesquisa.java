package br.com.onequest.dao.hibernate;

import org.springframework.stereotype.Repository;

import br.com.onequest.dao.DAOPesquisa;
import br.com.onequest.entidades.Pesquisa;

@Repository
public class HBPesquisa extends HBDAO<Pesquisa> implements DAOPesquisa{

	@Override
	protected Class getClazz() {
		return Pesquisa.class;
	}

}
