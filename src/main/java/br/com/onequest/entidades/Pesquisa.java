package br.com.onequest.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity @Table(name="pesquisa")
public class Pesquisa implements Serializable{

	private static final long serialVersionUID = -778055586850536962L;

	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true) 
	private Long id;
	
	private String titulo;
	
	private String descricao;
	
	@OneToMany(mappedBy="pesquisa")
	private List<LayoutPesquisa> layoutPesquisas;
	
	@ManyToOne @JoinColumn(name="empresa_id", nullable=false)
	private Empresa empresa;

	@ManyToOne @JoinColumn(name="usuario_id", nullable=false)
	private Usuario usuario;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	public List<LayoutPesquisa> getLayoutPesquisas() {
		
		if(layoutPesquisas==null|| layoutPesquisas.size()==0)
			layoutPesquisas  =  new ArrayList<LayoutPesquisa>();
		
		return layoutPesquisas;
	}

	public void setLayoutPesquisas(List<LayoutPesquisa> layoutPesquisas) {
		this.layoutPesquisas = layoutPesquisas;
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
