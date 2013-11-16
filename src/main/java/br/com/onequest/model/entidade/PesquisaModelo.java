package br.com.onequest.model.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import br.com.onequest.enuns.EntradaTipo;

@Entity(name="pesquisa_modelo")
public class PesquisaModelo implements Serializable{

	private static final long serialVersionUID = 5208960688197483524L;
	
	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true) 
	protected long id;

	private String etiqueta;
	
	@Enumerated(EnumType.ORDINAL)
	private EntradaTipo entradaTipo;
	
	private Integer posicao;

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public EntradaTipo getEntradaTipo() {
		return entradaTipo;
	}

	public void setEntradaTipo(EntradaTipo entradaTipo) {
		this.entradaTipo = entradaTipo;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}
		
}
