package com.cursojavabasico.aula13.lab;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe o segundo número:");
		int numero2 = scan.nextInt();
		
		System.out.println("A soma dos números informados é: " + (numero1 + numero2));

	}

}
