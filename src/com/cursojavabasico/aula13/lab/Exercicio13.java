package com.cursojavabasico.aula13.lab;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor que você recebe por hora?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalhou este mês?");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		System.out.println("Seu salário bruto será: " + salarioBruto);
		
		double irpf = salarioBruto * 0.11;
		System.out.println("Você pagará ao IRPF: " + irpf);

		double inss = salarioBruto * 0.08;
		System.out.println("Você pagará ao INSS: " + inss);

		double sindicato = salarioBruto * 0.05;
		System.out.println("Você pagará ao Sindicato: " + sindicato);
		
		System.out.println("Seu salário líquido será: " + (salarioBruto - irpf - inss - sindicato));
		
	}

}
