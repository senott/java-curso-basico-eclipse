package com.cursojavabasico.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com sua idade:");
		
		int idade = scan.nextInt();
		
		if(idade>=18){
			
			System.out.println("Você é maior de idade!");
			
		} else {
			
			System.out.println("Você é menor de idade!");
			
		}
		
		System.out.println("Informe o preço do produto:");
		
		double preco = scan.nextDouble();
		
		if(preco <= 10){
			
			System.out.println("Está barato. Compre!");
			
		} else if(preco > 10 && preco <= 15){
			
			System.out.println("Valor razoável, mas você deve exigir desconto.");
			
		} else if(preco > 15 && preco <= 17){
			
			System.out.println("Você deve continuar pesquisando.");
			
		} else {
			
			System.out.println("O produto está muito caro, desista da compra!");
			
		}
		
	}

}
