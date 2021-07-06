package br.com.generation.javaplataforma0507;

import java.util.Scanner;

public class ExercícioDoWhile2 {

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
		
		System.out.println("O média dos numeros divisíveis por 3 é: " + soma / sn);
		ler.close();
	}

}
