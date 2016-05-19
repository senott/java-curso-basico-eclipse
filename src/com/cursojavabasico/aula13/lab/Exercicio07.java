package com.cursojavabasico.aula13.lab;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o lado do quadrado:");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		System.out.println("A área do quadrado é: " + area);
		System.out.println("O dobro da área é: " + area * 2);
		
	}

}
