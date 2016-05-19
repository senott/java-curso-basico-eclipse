package com.cursojavabasico.aula13.lab;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em °F:");
		double tempF = scan.nextDouble();
		
		double tempC = (5 * (tempF-32)/9);
		System.out.println("A temperatura em °C é: " + tempC);

	}

}
