package br.com.onequest.dao.hibernate;

import org.springframework.stereotype.Repository;

import br.com.onequest.dao.DAOAssunto;
import br.com.onequest.entidades.Assunto;

@Repository
public class HBAssunto extends HBDAO<Assunto> implements DAOAssunto {


	protected Class getClazz() {
		return Assunto.class;
	}

}
