package br.com.onequest.model.entidade;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import br.com.onequest.enuns.EstadoPesquisa;

@Entity(name="pesquisa")
public class Pesquisa implements Serializable{
	
	private static final long serialVersionUID = 7421015191678865635L;

	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true) 
	protected long id;
	
	private String titulo;
	
	@OneToOne 
	@JoinColumn(name="id_pesquisa_modelo")
	private PesquisaModelo pesquisaModelo;
	
	private Calendar dataInicio;
	
	private Calendar dataFinal;
	
	@Enumerated(EnumType.ORDINAL)
	private EstadoPesquisa estadoPesquisa;
	
	@ManyToOne
	@JoinColumn(name="id_empresa",insertable=true, updatable=true)
	@Cascade(CascadeType.SAVE_UPDATE )
	private Empresa empresa;
	
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public PesquisaModelo getPesquisaModelo() {
		return pesquisaModelo;
	}

	public void setPesquisaModelo(PesquisaModelo pesquisaModelo) {
		this.pesquisaModelo = pesquisaModelo;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal = dataFinal;
	}

	public EstadoPesquisa getEstadoPesquisa() {
		return estadoPesquisa;
	}

	public void setEstadoPesquisa(EstadoPesquisa estadoPesquisa) {
		this.estadoPesquisa = estadoPesquisa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}
