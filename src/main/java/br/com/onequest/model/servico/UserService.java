package br.com.onequest.model.servico;

import br.com.onequest.model.entidade.Usuario;

public interface UserService extends ServiceBase<Usuario>{
	
	Usuario getUserByPassword(String login, String password);
	 
	 Usuario getUser(String login) ;
}
