package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o turno que você estuda (M-V-N):");
		String turno = scan.next();
		
		switch(turno){
		case "M": System.out.println("Bom dia!"); break;
		case "V": System.out.println("Boa tarde!"); break;
		case "N": System.out.println("Boa noite!"); break;
		default: System.out.println("Turno inválido!");
		}

	}

}
