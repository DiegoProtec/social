package br.com.social.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.social.dao.UsuarioDao;
import br.com.social.modelo.Usuario;

@Named
@RequestScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();
	
	@Inject
	private UsuarioDao usuarioDao;

	public void cadastrar() {
		usuarioDao.salvar(usuario);
		System.out.println(usuario + " cadastrado com sucesso!");
	}
}
