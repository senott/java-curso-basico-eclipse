package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o ano:");
		int ano = scan.nextInt();
		
		boolean bissexto;
		
		if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0){
			 
			bissexto = true;
			
		} else if (ano % 4 == 0) {
			
			bissexto = true;
			
		} else {
			
			bissexto = false;
			
		}
		
		if (bissexto == true){
			
			System.out.println("O ano informado é bissexto.");
			
		} else {
			
			System.out.println("O ano informado não é bissexto.");
			
		}
		
	}

}
