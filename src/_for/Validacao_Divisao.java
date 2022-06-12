package _for;

import java.util.Scanner;

public class Validacao_Divisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
				if(y == 0 ) {// se o valor de y foir igual a 0 é impossivel uma divisão
					System.out.println("divisão impossivel");
				}
				else {
					double div = (double) x/y; // se for verdadeiro o valor de X devera ser dividido pelo valor Y 
					System.out.printf("%.1f%n",div);
				}
		}
		
		sc.close();
	}

}
