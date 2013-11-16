package br.com.onequest.seguranca;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import br.com.onequest.model.entidade.Usuario;
import br.com.onequest.model.entidade.PermissaoUsuario;
import br.com.onequest.model.servico.UserPermissionService;
import br.com.onequest.model.servico.UserService;

public class SFAuthenticationProvider implements AuthenticationProvider {
	
	@Autowired
	private UserService userService;

	@Autowired
	private UserPermissionService userPermissionService;

	
	public Authentication authenticate(Authentication auth)	throws AuthenticationException {
		UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) auth;
		String login = token.getName();
		String password    = token.getCredentials() != null ? token.getCredentials().toString() : null;
		Usuario user =userService.getUserByPassword(login, password);
		if (user == null) {
			return null;
		}
		List<PermissaoUsuario> permission = userPermissionService.findPermissoesUsuario(user);
		SFAuthentication resultado = new SFAuthentication(user, permission);
		resultado.setAuthenticated(user != null);
		return resultado;
	}

	public boolean supports(Class<?> authentication) {
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}

}
