package com.example.appReceitasJava.model.domain;

public abstract class Receita {
	
	private String nomeReceita;
	private Float valorTotalReceita;
	private int codigo;
	
	@Override
	public String toString() {
		return String.format("nomeReceita (%s) - valorTotalReceita (%.2f) - codigo (%d)", nomeReceita, valorTotalReceita, codigo);
	}
	
	public Float getValorTotalReceita() {
		return valorTotalReceita;
	}
	public void setValorTotalReceita(Float valorTotalReceita) {
		this.valorTotalReceita = valorTotalReceita;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomeReceita() {
		return nomeReceita;
	}
	public void setNomeReceita(String nomeReceita) {
		this.nomeReceita = nomeReceita;
	}

	
}
