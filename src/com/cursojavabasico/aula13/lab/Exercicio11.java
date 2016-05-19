package com.cursojavabasico.aula13.lab;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número inteiro:");
		int inteiro1 = scan.nextInt();
		
		System.out.println("Informe o segundo número inteiro:");
		int inteiro2 = scan.nextInt();
		
		System.out.println("Informe o número real:");
		double real = scan.nextDouble();		

		System.out.println("Dobro do primeiro * Metade do segundo: " + (inteiro1 * 2) * (inteiro2 / 2));
		System.out.println(inteiro1);
		System.out.println("Triplo do primeiro + terceiro: " + ((inteiro1 * 3) + real));
		
		System.out.println("Terceiro elevado ao cubo: " + Math.pow(real , 3));
		
	}

}
