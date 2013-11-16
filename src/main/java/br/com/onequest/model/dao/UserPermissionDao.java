package br.com.onequest.model.dao;

import java.util.List;

import br.com.onequest.model.entidade.Usuario;
import br.com.onequest.model.entidade.PermissaoUsuario;

public interface UserPermissionDao extends DAOBase<PermissaoUsuario>{
	
	List<PermissaoUsuario> findPermissoesUsuario(Usuario user);

}
