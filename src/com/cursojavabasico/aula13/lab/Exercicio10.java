package com.cursojavabasico.aula13.lab;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em °C:");
		double tempC = scan.nextDouble();
		
		double tempF = ((tempC/5) * 9) + 32;
		System.out.println("A temperatura em °F é: " + tempF);
		
	}
}
