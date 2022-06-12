package _for;

import java.util.Scanner;

public class NumeroDeLinha_Quadrado_Cubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 1; i <= n ; i++) {
			
			int linha =i;
			int quadrado = i * i;
			int cubo = i * i *i;
			System.out.printf("%d %d %d%n", linha, cubo, quadrado);
		}
		sc.close();
	}

}
