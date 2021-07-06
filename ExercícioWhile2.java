package br.com.generation.javaplataforma0507;

import java.util.Scanner;

public class ExercícioWhile2 {
	
	public static void main(String[] args) {
		
		int c = 1, idade, maisqnerv = 0, sexo, humor, pcalm = 0, mnerv = 0, hagre = 0, ocalm = 0, jcalm = 0;
		
		Scanner ler = new Scanner(System.in);
		
		while (c <= 15) {
			
			System.out.println("Idade: ");
			idade = ler.nextInt();
			System.out.println("------------------------------------------------");
			
			System.out.print("1: Feminino" + "\n2: Masculino" + "\n3: Outros");
			System.out.println("----------------------");
			System.out.println("Sexo: ");
			sexo = ler.nextInt();
			System.out.println("-----------------------------------------------");
		
			System.out.println("1: Calma" + "\n2: Nervosa" + "3: Agressiva");
			System.out.println("Seu humor: ");
			humor = ler.nextInt();
			System.out.println("-----------------------------------------------");
			
		if (humor == 1) {
			pcalm++;
		}
		else if (sexo == 1 && humor == 2) {
			mnerv++;
		}
		else if (sexo == 2 && humor == 3) {
			hagre++;
		}
		else if (sexo == 3 && humor == 1) {
			ocalm++;
		}
		else if (idade > 40 && humor == 2) {
			maisqnerv++;
		}
		else if (idade < 18 && humor == 1) {
			jcalm++;
		}
		}
			System.out.println("O numero de pessoas calmas foi: " + pcalm);
			System.out.println("O numero de mulheres nervosas foi: " + mnerv);
			System.out.println("O numero de homens agressivos foi: " + hagre);
			System.out.println("O numero de outros calmos foi: " + ocalm);
			System.out.println("O numero de pessoas nervosas com mais de 40 anos foi: " + maisqnerv);
			System.out.println("O numero de pessoas calmas com menos de 18 foi: " + jcalm);
			ler.close();
	}
		
}


