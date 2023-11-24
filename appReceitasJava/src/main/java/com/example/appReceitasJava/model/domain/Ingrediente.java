package com.example.appReceitasJava.model.domain;

public class Ingrediente extends Receita{
	
	private String nomeIngrediente;
	private Float precoIngrediente;
	private Float quantidadeIngrediente;
	private Float quantidadeUtilizadaIngrediente;
	
	@Override
	public String toString() {
		return String.format(" %s - nomeIngrediente (%s) - precoIngrediente (%,2f) - quantidadeIngrediente (%,2f) - quantidadeUtilizadaIngrediente (%,2f)", 
				super.toString(), nomeIngrediente, precoIngrediente, quantidadeIngrediente, quantidadeUtilizadaIngrediente 
				);
	}
	
	public String getNomeIngrediente() {
		return nomeIngrediente;
	}
	public void setNomeIngrediente(String nomeIngrediente) {
		this.nomeIngrediente = nomeIngrediente;
	}
	public Float getPrecoIngrediente() {
		return precoIngrediente;
	}
	public void setPrecoIngrediente(Float precoIngrediente) {
		this.precoIngrediente = precoIngrediente;
	}
	public Float getQuantidadeIngrediente() {
		return quantidadeIngrediente;
	}
	public void setQuantidadeIngrediente(Float quantidadeIngrediente) {
		this.quantidadeIngrediente = quantidadeIngrediente;
	}
	public Float getQuantidadeUtilizadaIngrediente() {
		return quantidadeUtilizadaIngrediente;
	}
	public void setQuantidadeUtilizadaIngrediente(Float quantidadeUtilizadaIngrediente) {
		this.quantidadeUtilizadaIngrediente = quantidadeUtilizadaIngrediente;
	}
}
