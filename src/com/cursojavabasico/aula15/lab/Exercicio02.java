package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro:");
		
		int numero1 = scan.nextInt();
		
		if(numero1 > 0){
			
			System.out.println(numero1 + " é positivo.");
			
		} else {
			
			System.out.println(numero1 + " é negativo.");

		}


	}

}
