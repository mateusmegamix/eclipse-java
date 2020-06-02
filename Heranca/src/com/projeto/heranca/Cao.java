package com.projeto.heranca;

public class Cao extends Animal{
	 public void latir() {
		 System.out.println("Latir");
	 }
	 public void correr() {
		 	super.correr();
			System.out.println("correr como cao");
		}
}
