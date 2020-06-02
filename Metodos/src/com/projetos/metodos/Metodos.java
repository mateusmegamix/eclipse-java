package com.projetos.metodos;

public class Metodos {

	public static void main(String[] args) {
	 int resultado;
	 resultado = multiplicar(2,5);
	 System.out.println(resultado + 2);

	}
	
	public static void meuMetodo() {
		
		System.out.println("Esse é meu metodo");
	}
	
	public static int multiplicar( int num1, int num2) {
		int resultado = 0;
		resultado = num1 * num2;
		System.out.println(resultado);
		
		return resultado;
	}

}
