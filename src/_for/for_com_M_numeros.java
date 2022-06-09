package _for;

import java.util.Scanner;

public class for_com_M_numeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		
		int soma = 0;
		for (int i=0; i<M; i++) {
			int x = sc.nextInt();
			soma = soma + x; 
		}
		System.out.println(soma);
		
		sc.close();
	}

}
