package com.cursojavabasico.aula13.lab;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo em Mb:");
		double arquivo = scan.nextDouble();
		
		System.out.println("Informe a velocidade da conexão em Mbps:");
		double velocidade = scan.nextDouble();
	
		double tempo = (arquivo / velocidade) / 60;
		
		System.out.println("O arquivo será baixado em " + tempo + " minutos.");
	}

}
