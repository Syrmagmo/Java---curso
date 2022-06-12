package _for;

import java.util.Scanner;

public class divisores_De_Um_mesmoNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0 ) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
