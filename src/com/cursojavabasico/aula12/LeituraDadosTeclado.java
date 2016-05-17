package com.cursojavabasico.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu nome é: " + primeiroNome);

		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite a sua altura:");
		Double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);
		*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animal de estimação:");
		String primeiroNome2 = scan.next();
		int idade2 = scan.nextInt();
		int quantidadeFilhos = scan.nextInt();
		double altura2 = scan.nextDouble();
		boolean animal = scan.nextBoolean();
		
		System.out.println("Primeiro nome: " + primeiroNome2);
		System.out.println("Idade: " + idade2);
		System.out.println("Quantidade de filhos: " + quantidadeFilhos);
		System.out.println("Altura: " + altura2);
		System.out.println("Tem animal de estimação: " + animal);
		
	}

}
