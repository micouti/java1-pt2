package br.com.generation.javaplataforma0507;

import java.util.Scanner;

public class ExercícioDoWhile1 {

	public static void main(String[] args) {
		
		int c = 1, n, soma = 0, soma2 = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			n = ler.nextInt();	
			
			soma2++;
			soma = soma + n;
		
		}while (n != 0);
		
		System.out.println("O total de numeros digitados foi: " + soma2);
		System.out.println("A soma dos numero digitado foi: " + soma);
	}

}
