package com.cursojavabasico.aula13.lab;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a distância em metros:");
		int distancia = scan.nextInt();
		
		System.out.println("A distância informada em centímetros é: " + (distancia * 100));

	}

}
