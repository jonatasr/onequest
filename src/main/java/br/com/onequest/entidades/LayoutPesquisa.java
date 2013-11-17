package br.com.onequest.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import br.com.onequest.enumeration.ComponenteTipo;

@Entity @Table(name="layout_pesquisa")
public class LayoutPesquisa {
	
	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true) 
	private Long id;
	
	@NotNull
	private Integer ordem;
	
	@NotNull
	private String questao;
	
	@Enumerated
	private ComponenteTipo componenteTipo;
	
	@OneToMany(mappedBy="layoutPesquisa")
	private List<ComponentePesquisa> componentePesquisas;

	@ManyToOne @JoinColumn(name="pesquisa_id", nullable=false)
	private Pesquisa pesquisa;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public String getQuestao() {
		return questao;
	}

	public void setQuestao(String questao) {
		this.questao = questao;
	}

	public ComponenteTipo getComponenteTipo() {
		return componenteTipo;
	}

	public void setComponenteTipo(ComponenteTipo componenteTipo) {
		this.componenteTipo = componenteTipo;
	}

	public List<ComponentePesquisa> getComponentePesquisas() {
		return componentePesquisas;
	}

	public void setComponentePesquisas(List<ComponentePesquisa> componentePesquisas) {
		this.componentePesquisas = componentePesquisas;
	}
	
	

}
