package com.cursojavabasico.aula13.lab;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informa a segunda nota:");
		double nota2 = scan.nextDouble();

		System.out.println("Informa a terceira nota:");
		double nota3 = scan.nextDouble();

		System.out.println("Informa a quarta nota:");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("Sua média no bimestre foi: " + media);

	}

}
