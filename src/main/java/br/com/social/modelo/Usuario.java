package br.com.social.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@Column(name = "email_usuario")
	private String email;
	
	@Column(name = "senha_usuario")
	private String senha;
	
	@Column(name = "nome_usuario")
	private String nome;
	
	@Column(name = "sobrenome_usuario")
	private String sobrenome;
	
	@Column(name = "telefone_usuario")
	private String telefone;

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
