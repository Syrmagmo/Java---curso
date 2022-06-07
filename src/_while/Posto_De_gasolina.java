package _while;

import java.util.Scanner;

public class Posto_De_gasolina {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0; 
		int disel = 0;
		
		int tipo = sc.nextInt();
		
		while(tipo != 4 ) {
			if (tipo == 1 ) {
				alcool += 1;
			}
			else if(tipo == 2) {
				gasolina += 1;
			}
			else if(tipo == 3) {
				disel += disel;
			}
			
			tipo =sc.nextInt();
		}
		
		System.out.println("Muito obrigado");
		System.out.printf("Alcool: %d%n",alcool);
		System.out.printf("gasolina: %d%n",gasolina);
		System.out.printf("disel: %d%n",disel);
	}

}
