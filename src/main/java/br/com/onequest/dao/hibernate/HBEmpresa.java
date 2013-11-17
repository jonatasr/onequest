package br.com.onequest.dao.hibernate;

import org.springframework.stereotype.Repository;

import br.com.onequest.dao.DAOEmpresa;
import br.com.onequest.entidades.Empresa;

@Repository
public class HBEmpresa extends HBDAO<Empresa> implements DAOEmpresa{

	@Override
	protected Class getClazz() {
	
		return Empresa.class;
	}


}
