package _Do_while;

import java.util.Scanner;

public class Graus_Em_Fahre_Gambiarra {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		char resp = 's';
		
		while (resp != 'n') {
			System.out.println("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.println("Deseja repetir (s/n)");
			resp = sc.next().charAt(0);
		}
	}

}
