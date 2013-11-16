package br.com.onequest.model.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.onequest.model.dao.UserPermissionDao;
import br.com.onequest.model.entidade.Usuario;
import br.com.onequest.model.entidade.PermissaoUsuario;

@Repository
public class UserPermissionDaoImpl extends AbstractDao<PermissaoUsuario> implements UserPermissionDao{

	@Override
	protected Class getClazz() {
		
		return PermissaoUsuario.class;
	}
	
	public List<PermissaoUsuario> findPermissoesUsuario(Usuario user) {
		if (user == null) {
			return new ArrayList<PermissaoUsuario>();
		}
		Query query = getSession().createQuery("from UserPermission pu where pu.user = ?");
		query.setEntity(0, user);
		return query.list();
	}

}
