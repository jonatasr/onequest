package br.com.onequest.model.entidade;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity @Table(name="usuario")
public class Usuario implements java.io.Serializable {

	private static final long serialVersionUID = -5515555334078834540L;

	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true) 
	protected long id;
	
	public long getId() {return id;}
	public void setId(long valor) {this.id = valor;}
	
	@NotNull @NotEmpty
	@Column(name="name", nullable=false, length=128)
	private String nome;
	
	@Email(message="Isto não é um e-mail") @NotNull @NotEmpty
	@Column(name="email", nullable=false, length=128, unique=true)
	private String email;
	
	@NotNull
	@Column(name="data_cadastro", nullable=false) @Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro ;
	
	@NotNull @NotEmpty
	@Size(min=8, max=32, message="Login muito curto ou muito longo") 
	@Column(name="login", nullable=false, unique=true, length=64)
	private String login;

	@Transient
	private String senha;
	
	@Column(name="hash_password", nullable=false, length=128)
	private String hashSenha;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	@Cascade(CascadeType.ALL )
	private Set<Empresa> empresas;

	@OneToOne 
	@JoinColumn(name="id_endereco")
	private Endereco endereco;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	@Cascade(CascadeType.ALL )
	private Set<Pesquisa> pesquisas;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	@Cascade(CascadeType.ALL )
	private Set<Correspondente> correspondentes;

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
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getHashSenha() {
		return hashSenha;
	}
	public void setHashSenha(String hashSenha) {
		this.hashSenha = hashSenha;
	}
	public Set<Empresa> getEmpresas() {
		return empresas;
	}
	public void setEmpresas(Set<Empresa> empresas) {
		this.empresas = empresas;
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
