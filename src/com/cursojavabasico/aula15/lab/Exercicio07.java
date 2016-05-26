package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		double numero1 = scan.nextDouble();
		
		System.out.println("Informe o segundo número:");
		double numero2 = scan.nextDouble();
	
		System.out.println("Informe o terceiro número:");
		double numero3 = scan.nextDouble();

		// Retorna o maior número
		if (numero1 >= numero2){
			
			if (numero1 >= numero3){
				
				System.out.println("O maior número é: " + numero1);
								
			} else {
				
				System.out.println("O maior número é: " + numero3);
			
			}
			
		} else {
			
			if (numero2 >= numero3){
				
				System.out.println("O maior número é: " + numero2);
				
			} else {
				
				System.out.println("O maior número é: " + numero3);
				
			}

		}

		// Retorna o menor número
		if (numero1 <= numero2){
			
			if (numero1 <= numero3){
				
				System.out.println("O menor número é: " + numero1);
								
			} else {
				
				System.out.println("O menor número é: " + numero3);
			
			}
			
		} else {
			
			if (numero2 <= numero3){
				
				System.out.println("O menor número é: " + numero2);
				
			} else {
				
				System.out.println("O menor número é: " + numero3);
				
			}

		}

	}

}
