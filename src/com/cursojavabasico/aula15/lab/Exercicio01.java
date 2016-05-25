package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe dois números inteiros:");
		
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		if(numero1>numero2){
			
			System.out.println("O maior número é " + numero1);
			
		} else {
			
			System.out.println("O maior número é " + numero2);
			
		}

	}

}
