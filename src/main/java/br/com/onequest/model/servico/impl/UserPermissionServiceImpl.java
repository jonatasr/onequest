package br.com.onequest.model.servico.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.onequest.model.dao.UserPermissionDao;
import br.com.onequest.model.entidade.Usuario;
import br.com.onequest.model.entidade.PermissaoUsuario;
import br.com.onequest.model.servico.UserPermissionService;

@Service
public class UserPermissionServiceImpl implements UserPermissionService{
	
	@Autowired
	private UserPermissionDao userPermissionDao;

	@Override
	public List<PermissaoUsuario> list(int offset, int max) {
		return userPermissionDao.list(offset, max);
	}

	@Override
	public void save(PermissaoUsuario entity) {
		userPermissionDao.save(entity);
	}

	@Override
	public void delete(PermissaoUsuario entity) {
		userPermissionDao.delete(entity);
	}

	@Override
	public PermissaoUsuario get(Long id) {
		return userPermissionDao.get(id);
	}
	
	@Override
	public void addRole(String role, Usuario user) {
		if (role != null && user != null) {
			PermissaoUsuario userPermission = new PermissaoUsuario();
			userPermission.setRole(role);
			userPermission.setUser(user);
			save(userPermission);
		}
	}

	@Override
	public List<PermissaoUsuario> findPermissoesUsuario(Usuario user) {
		return userPermissionDao.findPermissoesUsuario(user);
	}
		

}
