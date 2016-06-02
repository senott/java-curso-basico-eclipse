package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota:");
		double nota1 = scan.nextDouble();

		System.out.println("Informe a segunda nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String conceito;
		
		if (media > 9){
			
			conceito = "A";
		
		} else if (media > 7.5 && media <= 9){
			
			conceito = "B";
			
		} else if (media <= 7.5 && media > 6){
			
			conceito = "C";
			
		} else if (media <= 6 && media > 4){
			
			conceito = "D";
			
		} else {
			
			conceito = "E";
			
		}
		
		String resultado;
		
		if (conceito == "D" || conceito == "E"){
			
			resultado = "Reprovado";
					
		} else {
			
			resultado = "Aprovado";
					
		}
		
		System.out.println("Primeira nota: " + nota1);
		System.out.println("Segunda nota: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		System.out.println("Resultado: " + resultado);

	}

}
