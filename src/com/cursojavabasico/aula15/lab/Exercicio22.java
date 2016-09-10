package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double precoMorangoAte5kg = 2.5;
		double precoMorangoMais5kg = 2.2;
		double precoMacaAte5kg = 1.8;
		double precoMacaMais5kg = 1.5;
		double valor = 0;
		
		System.out.println("Quantos kg de morango?");
		Double morangos = scan.nextDouble();

		System.out.println("Quantos kg de maçã?");
		Double macas = scan.nextDouble();
		
		if (morangos <= 5){
			valor = morangos * precoMorangoAte5kg;
		} else {
			valor = morangos * precoMorangoMais5kg;
		}
		
		if (macas <= 5){
			valor = (macas * precoMacaAte5kg) + valor;
		} else {
			valor = (macas * precoMacaMais5kg) + valor;
		}
		
		if (valor > 25 || morangos + macas > 8){
			valor = valor * 0.9;
		}
		
		System.out.println("O valor a ser pago é: " + valor);
		
	}

}
