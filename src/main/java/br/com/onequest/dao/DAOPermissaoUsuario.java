package br.com.onequest.dao;

import java.util.List;

import br.com.onequest.entidades.PermissaoUsuario;
import br.com.onequest.entidades.Usuario;

public interface DAOPermissaoUsuario {
	
	public List<PermissaoUsuario> getPermissoesUsuario(Usuario usuario);
	
	public void addRole(String role, Usuario usuario);
	
}
