package _for;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = 1;
		for(int i = 1 ; i < N; i++) {
			 X = X * i;
		}
		System.out.println(X);
		sc.close();
	}
}
