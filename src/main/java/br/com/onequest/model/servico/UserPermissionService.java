package br.com.onequest.model.servico;

import java.util.List;

import br.com.onequest.model.entidade.Usuario;
import br.com.onequest.model.entidade.PermissaoUsuario;

public interface UserPermissionService extends ServiceBase<PermissaoUsuario>{
	
	List<PermissaoUsuario> findPermissoesUsuario(Usuario user);
	 void addRole(String role, Usuario user);

}
