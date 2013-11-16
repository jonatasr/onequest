package br.com.onequest.model.servico.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.onequest.model.dao.UserDao;
import br.com.onequest.model.entidade.Usuario;
import br.com.onequest.model.servico.UserService;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserDao userDao;
	
	public List<Usuario> list(int offset, int max) {
		
		return userDao.list(offset, max);
	}

	@Override
	public void save(Usuario user) {
		userDao.save(user);
		
	}

	@Override
	public void delete(Usuario user) {
		userDao.delete(user);
		
	}

	@Override
	public Usuario get(Long id) {
	
		return userDao.get(id);
	}

	@Override
	public Usuario getUserByPassword(String login, String password) {
		return userDao.findUserByPassword(login, password);
	}

	@Override
	public Usuario getUser(String login) {
		return userDao.findUser(login);
	}



}
