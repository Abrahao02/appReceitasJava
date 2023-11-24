package com.example.appReceitasJava.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class CriarReceita {
	
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	private Login login;
	private List<Receita> receitas;
	
	@Override
	public String toString() {
		return String.format(" descricao(%s) - data (%s) - web (%s) - login (%s) - receitas (???)",
				descricao, data, web, login, receitas
				);
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public boolean isWeb() {
		return web;
	}
	public void setWeb(boolean web) {
		this.web = web;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public List<Receita> getReceitas() {
		return receitas;
	}
	public void setReceitas(List<Receita> receitas) {
		this.receitas = receitas;
	}
	
	
}
