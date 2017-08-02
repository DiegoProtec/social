package br.com.social.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.social.modelo.Usuario;

@Named
@RequestScoped
public class LoginBean {

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void cadastrar() {
		System.out.println(usuario + " cadastrado com sucesso!");
	}

}
