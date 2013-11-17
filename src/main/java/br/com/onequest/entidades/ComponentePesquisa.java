package br.com.onequest.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity @Table(name="componente_pesquisa")
public class ComponentePesquisa implements Serializable{

	private static final long serialVersionUID = 4986497330067914580L;

	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true) 
	private Long id;
	
	private Integer ordem;
	
	private String etiqueta;
	
	private Boolean respostaAlternativa;
	
	private String respostaTexto;
	
	@ManyToOne @JoinColumn(name="layout_pesquisa_id", nullable=false)
	private LayoutPesquisa layoutPesquisa;

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public Boolean getRespostaAlternativa() {
		return respostaAlternativa;
	}

	public void setRespostaAlternativa(Boolean respostaAlternativa) {
		this.respostaAlternativa = respostaAlternativa;
	}

	public String getRespostaTexto() {
		return respostaTexto;
	}

	public void setRespostaTexto(String respostaTexto) {
		this.respostaTexto = respostaTexto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LayoutPesquisa getLayoutPesquisa() {
		return layoutPesquisa;
	}

	public void setLayoutPesquisa(LayoutPesquisa layoutPesquisa) {
		this.layoutPesquisa = layoutPesquisa;
	}
	
	
}
