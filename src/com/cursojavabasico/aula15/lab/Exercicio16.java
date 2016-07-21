package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o elemento a:");
		double elementoA = scan.nextDouble();
		
		if (elementoA == 0){
			
			System.out.println("O valor informado para o elemento a é inválido.");
			
		} else {
			
			System.out.println("Informe o elemento b:");
			double elementoB = scan.nextDouble();
			
			System.out.println("Informe o elemento c:");
			double elementoC = scan.nextDouble();
			
			double delta = Math.pow(elementoB, 2) - 4 * elementoA * elementoC;
			
			if ( delta < 0 ){
				
				System.out.println("A equação não possui raízes reais.");
				
			} else if ( delta == 0 ){
				
				double resultado = ( elementoB * -1 ) / ( 2 * elementoA);
				
			}

		}

	}

}
