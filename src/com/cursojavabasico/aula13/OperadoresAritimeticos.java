package com.cursojavabasico.aula13;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println("Resultado = " + resultado);
		
		resultado = resultado - 1;
		System.out.println("Resultado = " + resultado);
		
		resultado = resultado * 2;
		System.out.println("Resultado = " + resultado);

		resultado = resultado / 2;
		System.out.println("Resultado = " + resultado);

		resultado = resultado + 8;
		System.out.println("Resultado = " + resultado);
		
		resultado = resultado % 7;
		System.out.println("Resultado = " + resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma string concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);

		resultado++;
		System.out.println("Resultado = " + resultado);
		
		System.out.println("Resultado = " + resultado++);
		System.out.println("Resultado = " + ++resultado);
		
		resultado--;
		System.out.println("Resultado = " + resultado);
		
		System.out.println("Resultado = " + resultado--);
		System.out.println("Resultado = " + --resultado);

	}

}
