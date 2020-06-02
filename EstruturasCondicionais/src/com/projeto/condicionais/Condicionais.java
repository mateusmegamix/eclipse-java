package com.projeto.condicionais;

public class Condicionais {

	public static void main(String[] args) {
		
		//boolean teste = true;
		int media = 10;
		
		//se
		if(media < 6) {
			System.out.println("reprovado");
		}
		else if(media >= 6 && media <= 8){
			System.out.println("aprovado");
		}
		else if(media > 8){
			System.out.println("Aprovado - Excelente");
		}

	}

}
