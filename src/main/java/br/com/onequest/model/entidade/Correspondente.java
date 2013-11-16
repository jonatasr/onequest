package br.com.onequest.model.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import br.com.onequest.enuns.TipoCorrespondente;

@Entity 
@Table(name="correspondente")
public class Correspondente implements Serializable{

	private static final long serialVersionUID = -3043000094515499807L;
	
	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true) 
	protected long id;

	private String nome;
	
	private String email;

	private Endereco endereco;
	
	@Enumerated(EnumType.ORDINAL)
	private TipoCorrespondente tipoCorrespondente;
	
	@ManyToOne
	@JoinColumn(name="id_usuario",insertable=true, updatable=true)
	@Cascade(CascadeType.SAVE_UPDATE )
	private Usuario usuario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public TipoCorrespondente getTipoCorrespondente() {
		return tipoCorrespondente;
	}

	public void setTipoCorrespondente(TipoCorrespondente tipoCorrespondente) {
		this.tipoCorrespondente = tipoCorrespondente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
