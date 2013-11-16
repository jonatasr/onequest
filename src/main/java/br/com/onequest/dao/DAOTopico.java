package br.com.onequest.dao;

import java.util.List;

import br.com.onequest.entidades.Assunto;
import br.com.onequest.entidades.Topico;
import br.com.onequest.entidades.Usuario;

public interface DAOTopico extends DAOBase<Topico> {
	
	public List<Topico> getTopicosPorAutor(Usuario usuario);
	
	public List<Topico> getTopicosPorAssunto(Assunto assunto, int offset, int max);

}
