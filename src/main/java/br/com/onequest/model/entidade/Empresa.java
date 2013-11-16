package br.com.onequest.model.entidade;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity 
@Table(name="empresa")
public class Empresa implements Serializable{

	private static final long serialVersionUID = -7488344626658815773L;

	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true) 
	protected long id;
	
	private String nome;

	@OneToOne 
	@JoinColumn(name="id_endereco")
	private Endereco endereco;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empresa")
	@Cascade(CascadeType.ALL )
	private Set<Pesquisa> pesquisas;
	
	@ManyToOne
	@JoinColumn(name="id_usuario",insertable=true, updatable=true)
	@Cascade(CascadeType.SAVE_UPDATE )
	private Usuario usuario;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Set<Pesquisa> getPesquisas() {
		return pesquisas;
	}

	public void setPesquisas(Set<Pesquisa> pesquisas) {
		this.pesquisas = pesquisas;
	}

	
	
	
}
