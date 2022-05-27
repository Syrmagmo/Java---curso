package if_Else;

import java.util.Scanner;

public class duracao_do_jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1, valor2;
		int duracao;
		
		System.out.println("Quantas horas?(digite dois valores)");
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		if(valor1 < valor2 ) {
			duracao = valor2 - valor1;
		}
		else {
			duracao = 24 - valor1 + valor2;
		}
		
		System.out.println("o jogo durou " + duracao + " hora(s)");
		sc.close();
	}

}
