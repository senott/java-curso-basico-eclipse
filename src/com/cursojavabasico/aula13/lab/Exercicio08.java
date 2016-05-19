package com.cursojavabasico.aula13.lab;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor que você recebe por hora?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalhou este mês?");
		double horasTrabalhadas = scan.nextDouble();
		
		System.out.println("Seu salário bruto será: " + valorHora * horasTrabalhadas);

	}

}
