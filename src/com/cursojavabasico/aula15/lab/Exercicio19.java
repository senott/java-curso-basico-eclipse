package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número inteiro:");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe outro número inteiro:");
		int numero2 = scan.nextInt();
		
		System.out.println("Informe a operação que deseja realizar:");
		String operacao = scan.next();
		
		int resultado = 0;
		
		switch (operacao){
		case "+":
			resultado = numero1 + numero2;
			break;
		case "-":
			resultado = numero1 - numero2;
			break;
		case "*":
			resultado = numero1 * numero2;
			break;
		case "/":
			resultado = numero1 / numero2;
			break;
		}
		
		String par = "não";

		if (resultado % 2 == 0){
			
			par = "sim";

		}
		
		String positivo = "não";
		
		if (resultado >= 0){
			
			positivo = "sim";
			
		}
		
		System.out.println("Resultado: " + resultado + " par: " + par + " positivo: " + positivo);
		
	}

}
