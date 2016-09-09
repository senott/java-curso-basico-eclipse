package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int contador = 0;

		System.out.println("Telefonou para a vítima? (S - sim, N - não)");
		String resposta1 = scan.next();
		if (resposta1.equals("S")){ contador++; }

		System.out.println("Esteve no local do crime? (S - sim, N - não)");
		String resposta2 = scan.next();
		if (resposta2.equals("S")) { contador++; }
		
		System.out.println("Mora perto da vítima? (S - sim, N - não)");
		String resposta3 = scan.next();
		if (resposta3.equals("S")) { contador++; }
		
		System.out.println("Devia para a vítima? (S - sim, N - não)");
		String resposta4 = scan.next();
		if (resposta4.equals("S")) { contador++; }

		System.out.println("Já trabalhou com a vítima? (S - sim, N - não)");
		String resposta5 = scan.next();
		if (resposta5.equals("S")) { contador++; }

		switch (contador){
		case 2:
			System.out.println("Você é suspeito.");
			break;
		case 3:
			System.out.println("Você é cúmplice.");
			break;
		case 4:
			System.out.println("Você é cúmplice.");
			break;
		case 5:
			System.out.println("Você é o assassino.");
			break;
		default: System.out.println("Você é inocente.");
		}

	}

}
