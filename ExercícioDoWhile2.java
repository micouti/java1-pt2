package br.com.generation.javaplataforma0507;

import java.util.Scanner;

public class Exerc�cioDoWhile2 {

	public static void main(String[] args) {
		
		int n, soma = 0, sn = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.print("Digite um numero (zero(0) para sair): ");
			n = ler.nextInt();
			
			if (n != 0 && n % 3 == 0) {
				sn++;
				soma = soma + n;
			}
			
		}while (n != 0);
		
		System.out.println("O m�dia dos numeros divis�veis por 3 �: " + soma / sn);
		ler.close();
	}

}
