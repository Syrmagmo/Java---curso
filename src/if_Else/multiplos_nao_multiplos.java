package if_Else;

import java.util.Scanner;

public class multiplos_nao_multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1, valor2;
		
		System.out.println("Digite dois valores?");
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		if(valor1 % valor2 == 0 && valor2 % valor1 == 0) {
			System.out.println("sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
	}

}
