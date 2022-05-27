package if_Else;

import java.util.Scanner;

public class numero_par_ou_impar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.println("Qual o valor?");
		valor = sc.nextInt();
		
		if(valor % 2 == 0 ) {
			System.out.println("par");
		}
		else {
			System.out.println("impar");
		}
	}

}
