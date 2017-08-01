package br.com.social.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginBean {
	public void logar() {
		System.out.println("Logando!");
	}
}
