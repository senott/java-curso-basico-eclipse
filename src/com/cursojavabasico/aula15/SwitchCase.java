package com.cursojavabasico.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número representando o dia da semana (1-7):");
		
		int diaSemana = scan.nextInt();
		
		switch(diaSemana){
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda-feira"); break;
		case 3: System.out.println("Terça-feira"); break;
		case 4: System.out.println("Quarta-feira"); break;
		case 5: System.out.println("Quinta-feira"); break;
		case 6: System.out.println("Sexta-feira"); break;
		case 7: System.out.println("Sábado"); break;
		default: System.out.println("Dia da semana informado é inválido!");
		}

		switch(diaSemana){
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia útil"); break;
		case 1:
		case 7: System.out.println("Fim de semana"); break;
		default: System.out.println("Dia da semana informado é inválido!");
		}

	}

}
// http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15