package com.projeto.heranca;

public class Animal {

	//private String tamanho;
	//private double peso;
	private String cor;
	String Cachorro;
	String Passaro;
	
	public void Cachorro() {
		System.out.println("Cachorrinho pode:");
	}
	
	public void Passaro() {
		System.out.println("passarinho pode:");
	}
	
	public void correr() {
		System.out.println("correr como animal");
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}
}
