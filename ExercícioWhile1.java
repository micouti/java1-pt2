package br.com.generation.javaplataforma0507;

import java.io.IOException;
import java.util.Scanner;

public class ExercícioWhile1 {

	public static void main(String[] args) {
		
		int idade = 0, pessmen = 0, pessmai = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("PARA SAIR DIGITE: -99");
		
		while (idade != -99) {
			
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
			
		if (idade > 0 && idade < 21) {
			
			pessmen = pessmen + 1;
		}
		else if (idade > 50) {
			
			pessmai = pessmai + 1;
			
		}
		
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("O total de pessoas menores de 21 anos foi: " + pessmen);
		System.out.println("O total de pessoas maiores de 50 anos foi: " + pessmai);

	}

}
