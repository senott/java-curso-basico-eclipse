package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro lado do triângulo:");
		double lado1 = scan.nextDouble();

		System.out.println("Informe o segundo lado do triângulo:");
		double lado2 = scan.nextDouble();
		
		System.out.println("Informe o terceiro lado do triângulo:");
		double lado3 = scan.nextDouble();
		
		String tipo;
		
		double somaLado12 = lado1 + lado2;
		double somaLado13 = lado1 + lado3;
		double somaLado23 = lado2 + lado3;
		
		if ( somaLado12 < lado3 || somaLado13 < lado2 || somaLado23 < lado1){
			
			tipo = "Não é um triângulo!";
			
		} else {
			
			if (lado1 == lado2 && lado2 == lado3){
				
				tipo = "Triângulo Equilátero";
				
			} else if (lado1 != lado2 && lado2 != lado3){
				
				tipo = "Triângulo Escaleno";
				
			} else {
				
				tipo = "Triângulo Isósceles";
				
			}
			
		}
		
		System.out.println(tipo);

	}

}
