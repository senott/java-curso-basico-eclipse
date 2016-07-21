package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número inteiro:");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0){
			
			System.out.println("O número informado é par.");
			
		} else {
			
			System.out.println("O número informado é impar.");
			
		}

	}

}
