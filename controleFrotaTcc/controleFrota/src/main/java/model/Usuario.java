package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String re;
	private Integer telefone;
	private String cpf;
	private String endereco;
	private String email;
	private String senha;
	private Boolean inativarUsuario;
	


	public Usuario() {

	}

	public Usuario(Integer id, String nome, String re, Integer telefone, String cpf, String endereco, String email,
			String senha, Boolean inativarUsuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.re = re;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.senha = senha;
		this.inativarUsuario = inativarUsuario;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRe() {
		return re;
	}

	public void setRe(String re) {
		this.re = re;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getInativarUsuario() {
		return inativarUsuario;
	}

	public void setInativarUsuario(Boolean inativarUsuario) {
		this.inativarUsuario = inativarUsuario;
	}
}
