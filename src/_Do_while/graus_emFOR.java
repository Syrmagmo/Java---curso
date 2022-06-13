package _Do_while;

import java.util.Scanner;

public class graus_emFOR {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.0;
		
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
		System.out.print("Deseja repetir (s/n)");
		char resp = sc.next().charAt(0);
		
		while (resp != 'n') {
			System.out.println("Digite a temperatura em Celsius: ");
			C = sc.nextDouble();
			F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.println("Deseja repetir (s/n)");
			resp = sc.next().charAt(0);
		}
	}

}
