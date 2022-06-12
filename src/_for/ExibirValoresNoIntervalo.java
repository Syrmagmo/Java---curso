package _for;

import java.util.Scanner;

public class ExibirValoresNoIntervalo {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int in = 0;
		int out = 0;

		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt(); // X determina a quantidade de valores os quais serão inseridos 
			if(x >= 10 && x <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
