package br.com.onequest.seguranca;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import br.com.onequest.model.entidade.Usuario;
import br.com.onequest.model.entidade.PermissaoUsuario;

public class SFAuthentication implements Authentication {

	private final Usuario usuario;
	private boolean autentication;
	
	public SFAuthentication(Usuario user, List<PermissaoUsuario> permissions) {
		this.usuario = user;
		this.permissions = permissions;
	}
	
	public String getName() {
		return usuario != null ? usuario.getLogin() : null;
	}
	private List<PermissaoUsuario> permissions;
	
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return permissions;
	}

	public Object getCredentials() {
		return usuario != null ? usuario.getHashSenha() : null;
	}

	public Object getDetails() {
		return usuario;
	}

	public Object getPrincipal() {
		return usuario != null ? usuario.getLogin() : null;
	}

	public boolean isAuthenticated() {
		return this.autentication;
	}

	public void setAuthenticated(boolean isAuthenticated)
			throws IllegalArgumentException {
		this.autentication = isAuthenticated;
		
	}

}
