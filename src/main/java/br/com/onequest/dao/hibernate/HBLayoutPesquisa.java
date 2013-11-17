package br.com.onequest.dao.hibernate;

import org.springframework.stereotype.Repository;

import br.com.onequest.dao.DAOLayoutPesquisa;
import br.com.onequest.entidades.LayoutPesquisa;

@Repository
public class HBLayoutPesquisa extends HBDAO<LayoutPesquisa> implements DAOLayoutPesquisa{

	@Override
	protected Class getClazz() {
		return LayoutPesquisa.class;
	}

}
