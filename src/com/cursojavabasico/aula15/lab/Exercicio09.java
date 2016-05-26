package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		double numero1 = scan.nextDouble();
		
		System.out.println("Informe o segundo número:");
		double numero2 = scan.nextDouble();
	
		System.out.println("Informe o terceiro número:");
		double numero3 = scan.nextDouble();

		String ordem = "";
		
		if (numero1 >= numero2 && numero1 >= numero3){
			
			ordem = numero1 + ", ";
			
			if (numero2 >= numero3){
				
				ordem += numero2 + ", " + numero3;
				
			} else {
				
				ordem += numero3 + ", " + numero2;
				
			}
			
		} else if (numero2 >= numero1 && numero2 >= numero3){
			
			ordem = numero2 + ", ";
			
			if (numero1 >= numero3){
				
				ordem+= numero1 + ", " + numero3;
				
			} else {
				
				ordem += numero3 + ", " + numero1;
				
			} 

		} else {
			
			ordem = numero3 + ", ";
			
			if (numero1 >= numero2){
				
				ordem+= numero1 + ", " + numero2;
				
			} else {
				
				ordem += numero2 + ", " + numero1;
				
			}

		}
		
		System.out.println(ordem);
	}

}
