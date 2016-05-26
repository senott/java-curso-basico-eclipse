package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o preço do primeiro produto:");
		double produto1 = scan.nextDouble();
		
		System.out.println("Informe o preço do segundo produto:");
		double produto2 = scan.nextDouble();
	
		System.out.println("Informe o preço do terceiro produto::");
		double produto3 = scan.nextDouble();

		if (produto1 <= produto2){
			
			if (produto1 <= produto3){
				
				System.out.println("Você deve comprar o produto 1 que custa: " + produto1);
								
			} else {
				
				System.out.println("Você deve comprar o produto 3 que custa: " + produto3);
			
			}
			
		} else {
			
			if (produto2 <= produto3){
				
				System.out.println("Você deve comprar o produto 2 que custa: " + produto2);
				
			} else {
				
				System.out.println("Você deve comprar o produto 3 que custa: " + produto3);
				
			}

		}

	}

}
