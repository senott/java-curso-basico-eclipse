package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o seu salário:");
		double salarioAntigo = scan.nextDouble();
		
		int percentual;
		double aumento;
		double salarioNovo;
		
		if (salarioAntigo <= 280.0){
			
			percentual = 20;
			aumento = (salarioAntigo * percentual) / 100;
			salarioNovo = salarioAntigo + aumento;
			
		} else if (salarioAntigo > 280.0 && salarioAntigo < 700){
			
			percentual = 15;
			aumento = (salarioAntigo * percentual) / 100;
			salarioNovo = salarioAntigo + aumento;
			
		} else if (salarioAntigo >= 700.0 && salarioAntigo < 1500){
			
			percentual = 10;
			aumento = (salarioAntigo * percentual) / 100;
			salarioNovo = salarioAntigo + aumento;

		} else {
			
			percentual = 5;
			aumento = (salarioAntigo * percentual) / 100;
			salarioNovo = salarioAntigo + aumento;

		}

		System.out.println("O salário antigo era: " + salarioAntigo);
		System.out.println("O percentual de ajuste será: " + percentual);
		System.out.println("O valor do aumento será: " + aumento);
		System.out.println("O salário novo será: " + salarioNovo);

	}

}
