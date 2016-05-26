package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o sexo do seu amigo(a):");
		
		String sexo = scan.next();
		
		switch(sexo){
		case "F": System.out.println("Feminino"); break;
		case "M": System.out.println("Masculino"); break;
		default: System.out.print("Sexo inválido.");
		}

	}

}
