package br.com.onequest.model.dao.impl;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.onequest.model.dao.UserDao;
import br.com.onequest.model.entidade.Usuario;

@Transactional(propagation=Propagation.SUPPORTS)
@Repository("daoUsuario")
public class UserDaoImpl extends AbstractDao<Usuario> implements UserDao {

	protected Class getClazz() {
		return Usuario.class;
	}

	public Usuario findUserByPassword(String login, String password) {
		Query query = getSession().createQuery("from User usr where usr.login = ? and usr.hashPassword = ?");
		query.setString(0, login);
		query.setString(1, DigestUtils.sha256Hex(password));
		return (Usuario) query.uniqueResult();				   
	}

	public Usuario findUser(String login) {
		Query query = getSession().createQuery("from User usr where usr.login = ?");
		query.setString(0, login);
		return (Usuario) query.uniqueResult();
	}

	
	
}
