package _for;

import java.util.Scanner;

public class LeiaUmValorInteiro_Mostrar_Impar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 0 ; i <= x; i++) {
			if(i % 2 != 0) { // se I for divisivel por 2 e o resultado diferente de 0 Imprima
			System.out.println(i);
			}
		}
	 sc.close();
	}
}
