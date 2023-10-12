package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "re")
	private String re;
    @Column(name = "nome")
	private String nome;
    @Column(name = "telefone")
	private String telefone;
    @Column(name = "cpf")
	private String cpf;
    @Column(name = "endereco")
	private String endereco;
    @Column(name = "email")
	private String email;
    @Column(name = "senha")
	private String senha;
    @Column(name = "inativarUsuario")
	private Boolean inativarUsuario;
	


	public Usuario() {

	}

	public Usuario(String nome, String re, String telefone, String cpf, String endereco, String email,
			String senha, Boolean inativarUsuario) {
		super();

		this.nome = nome;
		this.re = re;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.senha = senha;
		this.inativarUsuario = inativarUsuario;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
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
