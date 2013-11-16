package br.com.onequest.model.dao;

import br.com.onequest.model.entidade.Usuario;


public interface UserDao extends DAOBase<Usuario> {
	
	 Usuario findUserByPassword(String login, String password);
	 
	 Usuario findUser(String login) ;
	
}
