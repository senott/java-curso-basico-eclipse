package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o seu valor hora:");
		double valorHora = scan.nextDouble();

		System.out.println("Informe a quantidade de horas trabalhadas:");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		
		int aliquotaIR;
		
		if (salarioBruto <= 900){
			
			aliquotaIR = 0;
			
		} else if (salarioBruto > 900 && salarioBruto <= 1500){
			
			aliquotaIR = 5;
			
		} else if (salarioBruto > 1500 && salarioBruto <= 2500){
			
			aliquotaIR = 10;
			
		} else {
			
			aliquotaIR = 20;
			
		}
		
		double descontoIR = (salarioBruto * aliquotaIR) / 100;
		
		double descontoINSS = salarioBruto * 0.1;
		
		double descontoSindicato = salarioBruto * 0.03;
		
		double fgts = salarioBruto * 0.11;
		
		double totalDescontos = descontoIR + descontoINSS + descontoSindicato;

		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("- IR (" + aliquotaIR + "%) : " + descontoIR);
		System.out.println("- INSS (10%) : " + descontoINSS);
		System.out.println("- Sindicato (3%) : " + descontoSindicato);
		System.out.println("FGTS : " + fgts);
		System.out.println("Total descontos : " + totalDescontos);
		System.out.println("Salário líquido : " + salarioLiquido);
		
	}

}
