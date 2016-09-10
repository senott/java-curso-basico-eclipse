package com.cursojavabasico.aula15.lab;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double precoAlcool = 1.9;
		double precoGasolina = 2.5;
		double valor = 0;
		
		System.out.println("Qual o combustível? (A - alcóol, G - gasolina)");
		String combustivel = scan.next();
		
		System.out.println("Quantos litros foram abastecidos?");
		Double litros = scan.nextDouble();
		
		switch (combustivel) {
		case "A":
			if (litros <= 20){
				valor = (precoAlcool * 0.97) * litros;
			} else {
				valor = (precoAlcool * 0.95) * litros;
			}
			break;
		case "G":
			if (litros <= 20){
				valor = (precoGasolina * 0.96) * litros;
			} else {
				valor = (precoGasolina * 0.94) * litros;
			}
			break;
		}
		
		System.out.println("Valor a ser pago: " + valor);
	}

}
